package com.nonelonely.buzzwords.model;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.Date;

/**
 * 描述:
 * 搜索记录
 *
 * @author 林平
 * @create 2020-09-06 16:34
 * 个人博客地址：https://www.nonelonely,com
 */
@Setter
@Getter
public class SearchRecords implements Serializable {

    private int lotId;

    private String lotWords ;// 搜索词语

    private Date createTime;// 搜索的时间
    private int hours;

    private int numbers;
}
