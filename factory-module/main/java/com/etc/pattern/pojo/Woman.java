package com.etc.pattern.pojo;

import cn.hutool.core.util.StrUtil;
import lombok.Data;

/**
 * 女性
 */
@Data
public class Woman implements Person{
    //编号
    private String id;
    //说明
    private String talk;
    //身高
    private String height;
    //体重
    private String weight;

    public Woman() {
    }
    public Woman(String id) {
        this.id = id;
        this.talk = id+":我是女性";
        this.height = "165";
        this.weight = "50";
    }

    public void talking() {
        System.out.println(StrUtil.format("{} 身高{}cm 体重{}kg", this.talk, height, weight));;
    }
}
