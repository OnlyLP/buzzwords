package com.nonelonely.buzzwords.controller;

import com.nonelonely.buzzwords.model.SysParam;
import com.nonelonely.buzzwords.service.SysParamService;
import com.nonelonely.buzzwords.util.ResultVoUtil;
import com.nonelonely.buzzwords.util.SysParamUtil;
import com.nonelonely.buzzwords.vo.ResultVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 描述:
 * ${DESCRIPTION}
 *
 * @author 林平
 * @create 2020-09-06 17:32
 * 个人博客地址：https://www.nonelonely.com
 */
@Controller
@RequestMapping("/admin/sysparam")
public class SysParamController {

    @Autowired
    private SysParamService sysParamService;
    /**
     * 保存添加/修改的数据
     */
    @PostMapping("/save")
    @ResponseBody
    public ResultVo save(SysParam sysParam) {
        // 复制保留无需修改的数据
        if (sysParam.getParamId() != null) {
            sysParamService.updateSysParam(sysParam);
        }else{
            SysParam beParam = sysParamService.getSysParam(sysParam.getName());
            if (beParam !=null){
                throw new RuntimeException("系统参数名称已经存在！");
            }else {
                // 保存数据
                sysParamService.savaSysParam(sysParam);
            }
        }
        if(sysParam.getParamId() != null){
            SysParamUtil.clearCache(sysParam.getName());
        }
        return ResultVoUtil.SAVE_SUCCESS;
    }
    /**
     * 获取系统参数
     */
    @GetMapping("/edit")
    @ResponseBody
    public ResultVo toEdit(String name) {
        SysParam beParam = sysParamService.getSysParam(name);
        return ResultVoUtil.success(beParam);
    }

    /**
     * 删除系统参数
     */
    @GetMapping("/del")
    @ResponseBody
    public ResultVo todel(String name) {
          sysParamService.delSysParamList(name);

        return ResultVoUtil.success();
    }
    /**
     * 系统参数数据列表
     */
    @GetMapping("/list")
    @ResponseBody
    public ResultVo list(SysParam sysParam) {

        List<SysParam> list = sysParamService.getSysParamList(sysParam);

        return ResultVoUtil.success(list);
    }

}
