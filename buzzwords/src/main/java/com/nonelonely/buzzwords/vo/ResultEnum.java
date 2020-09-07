package com.nonelonely.buzzwords.vo;


import com.nonelonely.buzzwords.exception.interfaces.ResultInterface;
import lombok.Getter;

/**
 * 后台返回结果集枚举
 * @author 小懒虫
 * @date 2018/8/14
 */
@Getter
public enum ResultEnum implements ResultInterface {

    /**
     * 通用状态
     */
    SUCCESS(20000, "成功"),
    ERROR(400, "错误"),




    ;

    private Integer code;

    private String message;

    ResultEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }
}
