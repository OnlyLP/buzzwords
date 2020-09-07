package com.nonelonely.buzzwords.service.impl;

import com.nonelonely.buzzwords.dao.SysParamDao;
import com.nonelonely.buzzwords.model.SysParam;
import com.nonelonely.buzzwords.service.SysParamService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 描述:
 * ${DESCRIPTION}
 *
 * @author 林平
 * @create 2020-09-06 17:40
 * 个人博客地址：https://www.nonelonely,com
 */
@Service
public class SysParamServiceImpl implements SysParamService {

    @Resource
    private SysParamDao sysParamDao;
    /**
     * @title 保存系统参数
     * @description
     * @author 林平
     * @updateTime 2020/9/6 17:10
     * @throws
     */
    public void savaSysParam(SysParam sysParam){
        sysParamDao.savaSysParam(sysParam);
    }
    /**
     * @title 更加系统参数名获取系统参数
     * @description
     * @author 林平
     * @updateTime 2020/9/6 17:11
     * @throws
     */
    public SysParam getSysParam(String name){


        return  sysParamDao.getSysParam(name);
    }

    /**
     * @title  获取系统参数列表
     * @description []
     * @author 林平
     * @updateTime 2020/9/6 17:12
     * @throws
     */
    public List<SysParam> getSysParamList(SysParam sysParam){

        return  sysParamDao.getSysParamList(sysParam);
    }

    /**
     * @title 删除系统参数
     * @description
     * @author 林平
     * @updateTime 2020/9/6 17:13
     * @throws
     */
    public void delSysParamList(String name){
        sysParamDao.delSysParamList(name);
    }
    /**
     * @title 更新系统参数
     * @description
     * @author 林平
     * @updateTime 2020/9/6 17:16
     * @throws
     */
    public void updateSysParam(SysParam sysParam){
        sysParamDao.updateSysParam(sysParam);
    }
}
