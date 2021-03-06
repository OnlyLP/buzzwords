package com.nonelonely.buzzwords.service;

import com.nonelonely.buzzwords.model.SetWords;

import java.util.List;

/**
 * 描述:
 * ${DESCRIPTION}
 *
 * @author 林平
 * @create 2020-09-06 23:36
 * 个人博客地址：https://www.nonelonely.com
 */
public interface SetWordsService {
    /**
     * @title 保存自定义的词语
     * @description
     * @author 林平
     * @updateTime 2020/9/6 17:21
     * @throws
     */
    void  saveSetWords(SetWords setWords);
    /**
     * @title 更新自定义的词语
     * @description
     * @author 林平
     * @updateTime 2020/9/6 17:21
     * @throws
     */
    void updateSetWords(SetWords setWords);
    /**
     * @title 获取自定义的词语
     * @description
     * @author 林平
     * @updateTime 2020/9/6 17:23
     * @throws
     */
    SetWords getSetWords(SetWords setWords);

    /**
     * @title 获取自定义的词语列表
     * @description
     * @author 林平
     * @updateTime 2020/9/6 17:23
     * @throws
     */
    List<SetWords> getSetWordsList();
    /**
     * @title 删除自定义词语
     * @description
     * @author 林平
     * @updateTime 2020/9/6 17:24
     * @throws
     */
    void  delSetWords(SetWords setWords);
    /**
     * @title 获取自定义的词语
     * @description
     * @author 林平
     * @updateTime 2020/9/6 17:23
     * @throws
     */
    SetWords findSetWords(SetWords setWords);
}
