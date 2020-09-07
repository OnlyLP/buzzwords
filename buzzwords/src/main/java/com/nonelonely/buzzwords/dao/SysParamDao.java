package com.nonelonely.buzzwords.dao;

import com.nonelonely.buzzwords.model.SysParam;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * 描述:
 * ${DESCRIPTION}
 *
 * @author 林平
 * @create 2020-09-06 17:08
 * 个人博客地址：https://www.nonelonely.com
 */
@Mapper
public interface SysParamDao {
    /**
     * @title 保存系统参数
     * @description
     * @author 林平
     * @updateTime 2020/9/6 17:10
     * @throws
     */
    void savaSysParam(SysParam sysParam);
    /**
     * @title 更加系统参数名获取系统参数
     * @description
     * @author 林平
     * @updateTime 2020/9/6 17:11
     * @throws
     */
    SysParam getSysParam(String name);

    /**
     * @title  获取系统参数列表
     * @description []
     * @author 林平
     * @updateTime 2020/9/6 17:12
     * @throws
     */
    List<SysParam> getSysParamList(SysParam sysParam);

   /**
    * @title 删除系统参数
    * @description
    * @author 林平
    * @updateTime 2020/9/6 17:13
    * @throws
    */
    void delSysParamList(String name);
    /**
     * @title 更新系统参数
     * @description
     * @author 林平
     * @updateTime 2020/9/6 17:16
     * @throws
     */
    void updateSysParam(SysParam sysParam);
}
