package com.nonelonely.buzzwords.controller;

import com.nonelonely.buzzwords.model.SearchRecords;
import com.nonelonely.buzzwords.model.SetWords;
import com.nonelonely.buzzwords.service.SearchRecordsService;
import com.nonelonely.buzzwords.service.SetWordsService;
import com.nonelonely.buzzwords.util.ResultVoUtil;
import com.nonelonely.buzzwords.util.SysParamUtil;
import com.nonelonely.buzzwords.vo.ResultVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * 描述:
 * ${DESCRIPTION}
 *
 * @author 林平
 * @create 2020-09-07 12:29
 * 个人博客地址：https://www.nonelonely.com
 */
@Controller
@RequestMapping("/admin/search")
public class SearchRecordsController {

    @Autowired
    private SearchRecordsService searchRecordsService;
    @Autowired
    private SetWordsService setWordsService;
    /**
     * 保存添加/修改的数据
     */
    @PostMapping("/save")
    @ResponseBody
    public ResultVo save(SearchRecords searchRecords) {
        searchRecordsService.saveSearchRecords(searchRecords);
        return ResultVoUtil.SAVE_SUCCESS;
    }

    /**
     * 数据列表
     */
    @GetMapping("/list")
    @ResponseBody
    public ResultVo list(SearchRecords searchRecords) {

        List<SetWords> list = setWordsService.getSetWordsList();
        List<SetWords> wordList = searchRecordsService.getSearchRecords(searchRecords);
        list.forEach(setWords-> {
            if (wordList.size() < setWords.getSort()) {    //如果设置的位置大于元素数量  那么直接添加到后面
                wordList.add(setWords);
            } else {
                wordList.add(setWords.getSort()-1, setWords);
            }
        });

        String numbers = SysParamUtil.value("numbers");
        if(numbers == null || "".equals(numbers)){
            numbers = "10" ; //默认10个
        }
        List<SetWords> arrayList = new ArrayList<>();
        int K = Integer.valueOf(numbers);
        for(int i = 0;i<K&&i<wordList.size();i++){
            wordList.get(i).setSort(i+1);
            arrayList.add( wordList.get(i));
        }
        return ResultVoUtil.success(arrayList);
    }

}
