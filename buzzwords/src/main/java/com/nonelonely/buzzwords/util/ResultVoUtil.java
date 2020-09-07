package com.nonelonely.buzzwords.util;


import com.nonelonely.buzzwords.vo.ResultEnum;
import com.nonelonely.buzzwords.vo.ResultVo;
/**
 * 描述:
 * ${DESCRIPTION}
 *
 * @author 林平
 * @create 2020-09-06 14:02
 * 个人博客地址：https://www.nonelonely.com
 */
public class ResultVoUtil {

    public static ResultVo SAVE_SUCCESS = success("保存成功");

    /**
     * 操作成功
     * @param msg 提示信息
     * @param object 对象
     */
    public static ResultVo success(String msg, Object object){
        ResultVo<Object> resultVo = new ResultVo<>();
        resultVo.setMessage(msg);
        resultVo.setCode(ResultEnum.SUCCESS.getCode());
        resultVo.setData(object);
        return resultVo;
    }
    /**
     * 操作成功
     * @param msg 提示信息
     * @param object 对象
     */
    public static ResultVo custom(Integer code,String msg, Object object){
        ResultVo<Object> resultVo = new ResultVo<>();
        resultVo.setMessage(msg);
        resultVo.setCode(code);
        resultVo.setData(object);
        return resultVo;
    }
    /**
     * 操作成功，使用默认的提示信息
     * @param object 对象
     */
    public static ResultVo success(Object object){
        String message = ResultEnum.SUCCESS.getMessage();
        return success(message, object);
    }

    /**
     * 操作成功，返回提示信息，不返回数据
     */
    public static ResultVo success(String msg){
        Object object = null;
        return success(msg, object);
    }

    /**
     * 操作成功，不返回数据
     */
    public static ResultVo success(){
        return success(null);
    }

    /**
     * 操作有误
     * @param code 错误码
     * @param msg 提示信息
     */
    public static ResultVo error(Integer code, String msg){
        ResultVo resultVo = new ResultVo();
        resultVo.setMessage(msg);
        resultVo.setCode(code);
        return resultVo;
    }

    /**
     * 操作有误，使用默认400错误码
     * @param msg 提示信息
     */
    public static ResultVo error(String msg){
        Integer code = ResultEnum.ERROR.getCode();
        return error(code, msg);
    }

    /**
     * 操作有误，只返回默认错误状态码
     */
    public static ResultVo error(){
        return error(null);
    }


}
