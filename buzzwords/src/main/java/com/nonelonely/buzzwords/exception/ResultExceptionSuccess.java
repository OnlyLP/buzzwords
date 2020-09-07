package com.nonelonely.buzzwords.exception;


import com.nonelonely.buzzwords.vo.ResultEnum;
import lombok.Getter;

/**
 * 描述:
 * 自定义异常对象{统一异常处理：成功}
 *
 * @author 林平
 * @create 2020-09-06 11:20
 * 个人博客地址：https://www.nonelonely,com
 */
@Getter
public class ResultExceptionSuccess extends ResultException {

    /**
     * 统一异常处理：抛出默认成功信息
     */
    public ResultExceptionSuccess() {
        super(ResultEnum.SUCCESS);
    }

    /**
     * 统一异常处理：抛出成功提示信息
     * @param message 提示信息
     */
    public ResultExceptionSuccess(String message) {
        super(ResultEnum.SUCCESS.getCode(), message);
    }
}