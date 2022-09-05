package com.etc.pattern.pojo;

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

    public Woman() {
    }
    public Woman(String id) {
        this.id = id;
        this.talk = id+":我是女性";
    }

    public void talking() {
        System.out.println(this.talk);;
    }
}
