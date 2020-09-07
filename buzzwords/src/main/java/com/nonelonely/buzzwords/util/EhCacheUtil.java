package com.nonelonely.buzzwords.util;

import net.sf.ehcache.Cache;
import net.sf.ehcache.CacheManager;

/**
 * 描述:
 * ${DESCRIPTION}
 *
 * @author 林平
 * @create 2020-09-06 13:30
 * 个人博客地址：https://www.nonelonely.com
 */
public class EhCacheUtil {

    /**
     * 获取EhCacheManager管理对象
     */
    public static CacheManager getCacheManager(){
        return SpringContextUtil.getBean(CacheManager.class);
    }

    /**
     * 获取EhCache缓存对象
     */
    public static Cache getCache(String name){
        return getCacheManager().getCache(name);
    }

    /**
     * 获取系统参数
     */
    public static Cache getParamCache(){
        return getCacheManager().getCache("sysparam");
    }

}
