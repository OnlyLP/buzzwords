package com.nonelonely.buzzwords.exception.interfaces;

/**
 * 描述:
 * 结果枚举接口
 *
 * @author 林平
 * @create 2020-09-06 11:20
 * 个人博客地址：https://www.nonelonely,com
 */
public interface ResultInterface {

    /**
     * 获取状态编码
     * @return 编码
     */
    Integer getCode();

    /**
     * 获取提示信息
     * @return 提示信息
     */
    String getMessage();

}
