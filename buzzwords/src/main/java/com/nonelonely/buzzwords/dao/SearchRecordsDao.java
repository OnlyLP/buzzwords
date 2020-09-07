package com.nonelonely.buzzwords.dao;

import com.nonelonely.buzzwords.model.SearchRecords;
import com.nonelonely.buzzwords.model.SetWords;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

/**
 * 描述:
 * ${DESCRIPTION}
 *
 * @author 林平
 * @create 2020-09-06 17:15
 * 个人博客地址：https://www.nonelonely,com
 */
@Mapper
public interface SearchRecordsDao {
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
    List<SetWords> getSearchRecords(@Param("hours") int hours, @Param("numbers")int numbers);
}
