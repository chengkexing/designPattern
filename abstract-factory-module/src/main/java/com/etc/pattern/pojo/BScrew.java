package com.etc.pattern.pojo;

import lombok.Data;

/**
 * B螺丝
 * @author chengkexing
 */
@Data
public class BScrew extends Screw{
    @Override
    public void remarking() {
        System.out.println(id+":我是B型号螺丝可以匹配B型号螺母");
    }
}
