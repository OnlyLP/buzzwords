package com.nonelonely.buzzwords.exception;

import com.nonelonely.buzzwords.vo.ResultEnum;

/**
 * 描述:
 * 自定义异常对象{统一异常处理：失败}
 *
 * @author 林平
 * @create 2020-09-06 11:20
 * 个人博客地址：https://www.nonelonely,com
 */
public class ResultExceptionError extends ResultException {

    /**
     * 统一异常处理：抛出默认失败信息
     */
    public ResultExceptionError() {
        super(ResultEnum.ERROR);
    }

    /**
     * 统一异常处理：抛出失败提示信息
     * @param message 提示信息
     */
    public ResultExceptionError(String message) {
        super(ResultEnum.ERROR.getCode(), message);
    }
}
