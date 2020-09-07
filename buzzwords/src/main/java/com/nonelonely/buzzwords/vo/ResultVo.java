package com.nonelonely.buzzwords.vo;

import lombok.Data;

/**
 * 描述:
 * ${DESCRIPTION}
 *
 * @author 林平
 * @create 2020-09-06 13:52
 * 个人博客地址：https://www.nonelonely,com
 */
@Data
public class ResultVo<T> {

    /** 状态码 */
    private Integer code;

    /** 提示信息 */
    private String message;

    /** 响应数据 */
    private T data;
}
