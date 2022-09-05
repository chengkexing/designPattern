package com.etc.pattern.pojo;

import lombok.Data;

/**
 * A螺母
 * @author chengkexing
 */
@Data
public class AScrewCap extends ScrewCap {
    @Override
    public void remarking() {
        System.out.println(id+":我是A型号螺母可以匹配A型号螺丝");
    }
}
