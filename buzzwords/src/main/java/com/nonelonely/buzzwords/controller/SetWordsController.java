package com.nonelonely.buzzwords.controller;

import com.nonelonely.buzzwords.model.SetWords;
import com.nonelonely.buzzwords.service.SetWordsService;
import com.nonelonely.buzzwords.util.ResultVoUtil;
import com.nonelonely.buzzwords.vo.ResultVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

/**
 * 描述:
 * 自定义热词控制层
 *
 * @author 林平
 * @create 2020-09-06 23:36
 * 个人博客地址：https://www.nonelonely.com
 */
@Controller
@RequestMapping("/admin/setwords")
public class SetWordsController {
    @Autowired
    private SetWordsService setWordsService;
    /**
     * 保存添加/修改的数据
     */
    @PostMapping("/save")
    @ResponseBody
    public ResultVo save(SetWords setWords) {
        SetWords beParam = setWordsService.findSetWords(setWords);
        if (beParam !=null){
            throw new RuntimeException("排名位置已经存在！");
        }
        // 复制保留无需修改的数据
        if (setWords.getSetId() != null) {
            setWordsService.updateSetWords(setWords);
        }else{

                setWordsService.saveSetWords(setWords);
            }
        return ResultVoUtil.SAVE_SUCCESS;
    }
    /**
     * 获取系统参数
     */
    @GetMapping("/edit")
    @ResponseBody
    public ResultVo toEdit(SetWords setWords) {
        SetWords beParam = setWordsService.getSetWords(setWords);
        return ResultVoUtil.success(beParam);
    }

    /**
     * 删除系统参数
     */
    @GetMapping("/del")
    @ResponseBody
    public ResultVo todel(SetWords setWords) {
        setWordsService.delSetWords(setWords);

        return ResultVoUtil.success();
    }
    /**
     * 系统参数数据列表
     */
    @GetMapping("/list")
    @ResponseBody
    public ResultVo list(SetWords setWords) {

        List<SetWords> list = setWordsService.getSetWordsList();

        return ResultVoUtil.success(list);
    }
}
