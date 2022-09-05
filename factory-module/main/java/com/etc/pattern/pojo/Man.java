package com.etc.pattern.pojo;

import cn.hutool.core.util.StrUtil;
import lombok.Data;

/**
 * 男性
 */
@Data
public class Man implements Person{
    //编号
    private String id;
    //说明
    private String talk;
    //身高
    private String height;
    //体重
    private String weight;

    public Man() {
    }
    public Man(String id) {
        this.id = id;
        this.talk = id+":我是男性";
        this.height = "185";
        this.weight = "80";
    }

    public void talking() {
        System.out.println(StrUtil.format("{} 身高{}cm 体重{}kg", this.talk, height, weight));;
    }
}
