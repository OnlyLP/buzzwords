package com.nonelonely.buzzwords.exception.advice;



/**
 * 描述:
 * 异常通知器接口
 *
 * @author 林平
 * @create 2020-09-06 11:10
 * 个人博客地址：https://www.nonelonely,com
 */
public interface ExceptionAdvice {

    /**
     * 运行
     * @param e 异常对象
     */
    void run(RuntimeException e);
}
