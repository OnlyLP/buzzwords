package com.nonelonely.buzzwords.model;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

/**
 * 描述:
 * ${DESCRIPTION}
 *
 * @author 林平
 * @create 2020-09-06 16:31
 * 个人博客地址：https://www.nonelonely,com
 */
@Getter
@Setter
public class SetWords implements Serializable {

    private  Long setId;

    private  String setWords; //定义的词语

    private int sort; //排序位置

    private int num;


}
