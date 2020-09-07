package com.nonelonely.buzzwords.service;

import com.nonelonely.buzzwords.model.SearchRecords;
import com.nonelonely.buzzwords.model.SetWords;

import java.util.List;
import java.util.Map;

/**
 * 描述:
 * ${DESCRIPTION}
 *
 * @author 林平
 * @create 2020-09-07 12:19
 * 个人博客地址：https://www.nonelonely.com
 */
public interface SearchRecordsService {

    /**
     * @title 保存搜索记录
     * @description
     * @author 林平
     * @updateTime 2020/9/6 17:16
     * @throws
     */
    void  saveSearchRecords(SearchRecords searchRecprds);

    /**
     * @title 获取hours小时前 搜索数量排名在num前的搜索词语
     * @description
     * @author 林平
     * @updateTime 2020/9/6 17:19
     * @throws
     */
    List<SetWords> getSearchRecords(SearchRecords searchRecprds);
}
