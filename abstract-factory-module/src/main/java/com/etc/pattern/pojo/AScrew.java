package com.etc.pattern.pojo;

import lombok.Data;

/**
 * A螺丝
 * @author chengkexing
 */
@Data
public class AScrew extends Screw{
    @Override
    public void remarking() {
        System.out.println(id+":我是A型号螺丝可以匹配A型号螺母");
    }
}
