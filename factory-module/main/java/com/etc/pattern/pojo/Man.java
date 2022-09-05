package com.etc.pattern.pojo;

import lombok.Data;

/**
 * 男性
 */
@Data
public class Man implements Person{
    private String id;
    private String talk;

    public Man() {
    }
    public Man(String id) {
        this.id = id;
        this.talk = id+":我是男性";
    }

    public void talking() {
        System.out.println(this.talk);;
    }
}
