package com.nonelonely.buzzwords.service.impl;

import com.nonelonely.buzzwords.dao.SetWordsDao;
import com.nonelonely.buzzwords.model.SetWords;
import com.nonelonely.buzzwords.service.SetWordsService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 描述:
 * ${DESCRIPTION}
 *
 * @author 林平
 * @create 2020-09-06 23:45
 * 个人博客地址：https://www.nonelonely.com
 */
@Service
public class SetWordsServiceImpl implements SetWordsService {
    @Resource
    private SetWordsDao setWordsDao;
    /**
     * @title 保存自定义的词语
     * @description
     * @author 林平
     * @updateTime 2020/9/6 17:21
     * @throws
     */
   public void  saveSetWords(SetWords setWords){
        setWordsDao.saveSetWords(setWords);
    }
    /**
     * @title 更新自定义的词语
     * @description
     * @author 林平
     * @updateTime 2020/9/6 17:21
     * @throws
     */
    public void updateSetWords(SetWords setWords){
        setWordsDao.updateSetWords(setWords);
    }
    /**
     * @title 获取自定义的词语
     * @description
     * @author 林平
     * @updateTime 2020/9/6 17:23
     * @throws
     */
    public SetWords getSetWords(SetWords setWords){
      return   setWordsDao.getSetWords(setWords);
    }

    /**
     * @title 获取自定义的词语列表
     * @description
     * @author 林平
     * @updateTime 2020/9/6 17:23
     * @throws
     */
    public List<SetWords> getSetWordsList(){
        return   setWordsDao.getSetWordsList();
    }
    /**
     * @title 删除自定义词语
     * @description
     * @author 林平
     * @updateTime 2020/9/6 17:24
     * @throws
     */
    public void  delSetWords(SetWords setWords){
        setWordsDao.delSetWords(setWords);
    }
    /**
     * @title 获取自定义的词语
     * @description
     * @author 林平
     * @updateTime 2020/9/6 17:23
     * @throws
     */
    public SetWords findSetWords(SetWords setWords){
       return  setWordsDao.findSetWords(setWords);
    }
}
