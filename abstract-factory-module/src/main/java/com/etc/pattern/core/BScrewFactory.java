package com.etc.pattern.core;

import cn.hutool.core.util.IdUtil;
import com.etc.pattern.pojo.*;

/**
 * 螺丝生产线
 * @author chengkexing
 * @version $Id: Pattern.java,v 1.
 */
public class BScrewFactory extends AbstractWorkshopFactory {
    @Override
    public Screw generatorScrew() {
        Screw screw = new BScrew();
        screw.setId(IdUtil.simpleUUID());
        return screw;
    }

    @Override
    public ScrewCap generatorScrewCap() {
        ScrewCap screwCap = new BScrewCap();
        screwCap.setId(IdUtil.simpleUUID());
        return screwCap;
    }
}
