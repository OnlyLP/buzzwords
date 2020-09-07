package com.nonelonely.buzzwords.util;



import com.nonelonely.buzzwords.model.SysParam;
import com.nonelonely.buzzwords.service.SysParamService;
import net.sf.ehcache.Cache;
import net.sf.ehcache.Element;

import java.text.SimpleDateFormat;
import java.util.Date;
/**
 * 描述:
 * ${DESCRIPTION}
 *
 * @author 林平
 * @create 2020-09-06 17:43
 * 个人博客地址：https://www.nonelonely.com
 */
public class SysParamUtil {

    private static Cache paramCache = EhCacheUtil.getParamCache();

    /**
     * 获取系统参数值
     * @param name 系统参数名称
     */
    public static String value(String name){
       String value = null;
        Element dictEle = paramCache.get(name);
        if(dictEle != null){
            value = dictEle.getObjectValue().toString();
        }else {
            SysParamService paramService = SpringContextUtil.getBean(SysParamService.class);
            SysParam param = paramService.getSysParam(name);
           if (param != null){
               paramCache.put(new Element(param.getName(), param.getValue()));
                value = param.getValue();
           }
        }
        return value;
    }

    /**
     * 清除缓存中指定的数据
     * @param label 字典标识
     */
    public static void clearCache(String label){
        Element dictEle = paramCache.get(label);
        if (dictEle != null){
            paramCache.remove(label);
        }
    }


    public static String timeDifference(Date endDate,Date startDate)throws Exception{
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        try {
            long l=endDate.getTime()-startDate.getTime();
            long day=l/(24*60*60*1000);
            long hour=(l/(60*60*1000)-day*24);
            long min=((l/(60*1000))-day*24*60-hour*60);
            long s=(l/1000-day*24*60*60-hour*60*60-min*60);
            return min+"〃"+s;
        }catch (Exception e){
            return "-";
        }


    }
}
