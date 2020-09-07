package com.nonelonely.buzzwords.model;


import lombok.Data;
import java.io.Serializable;

/**
 * 描述:
 * 系统参数
 *
 * @author 林平
 * @create 2020-09-06 16:31
 * 个人博客地址：https://www.nonelonely,com
 */

@Data
public class SysParam implements Serializable {
    // 主键paramId
    private Long paramId;
    //参数名
    private String name;
    // 参数值
    private String value;

    //说明

    private String remark;
}
