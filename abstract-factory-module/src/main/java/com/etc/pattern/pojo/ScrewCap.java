package com.etc.pattern.pojo;


/**
 * 螺母抽象类
 * @author chengkexing
 * @version 1.0
 */
public abstract class ScrewCap {
    protected String id;
    public abstract void remarking();

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
