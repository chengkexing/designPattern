package com.etc.pattern.pojo;

import lombok.Data;

/**
 * B螺母
 * @author chengkexing
 */
@Data
public class BScrewCap extends ScrewCap{
    @Override
    public void remarking() {
        System.out.println(id+":我是B型号螺母可以匹配B型号螺丝");
    }
}
