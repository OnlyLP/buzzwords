package com.nonelonely.buzzwords.service.impl;

import com.nonelonely.buzzwords.dao.SearchRecordsDao;
import com.nonelonely.buzzwords.model.SearchRecords;
import com.nonelonely.buzzwords.model.SetWords;
import com.nonelonely.buzzwords.service.SearchRecordsService;
import com.nonelonely.buzzwords.util.EhCacheUtil;
import com.nonelonely.buzzwords.util.SysParamUtil;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * 描述:
 * ${DESCRIPTION}
 *
 * @author 林平
 * @create 2020-09-07 12:20
 * 个人博客地址：https://www.nonelonely.com
 */
@Service
public class SearchRecordsServiceImpl implements SearchRecordsService {

    @Resource
    private SearchRecordsDao searchRecordsDao;
    /**
     * @title 保存搜索记录
     * @description
     * @author 林平
     * @updateTime 2020/9/6 17:16
     * @throws
     */
   public void  saveSearchRecords(SearchRecords searchRecprds){
        searchRecordsDao.saveSearchRecords(searchRecprds);
    }

    /**
     * @title 获取hours小时前 搜索数量排名在num前的搜索词语
     * @description
     * @author 林平
     * @updateTime 2020/9/6 17:19
     * @throws
     */
   public List<SetWords> getSearchRecords(SearchRecords searchRecprds){

       String hours = SysParamUtil.value("hours");
       if(hours == null || "".equals(hours)){
           hours = "12" ; //，默认12小时
       }
       String numbers = SysParamUtil.value("numbers");
       if(numbers == null || "".equals(numbers)){
           numbers = "10" ; //，默认个
       }

        return  searchRecordsDao.getSearchRecords(Integer.valueOf(hours),Integer.valueOf(numbers));
    }
}
