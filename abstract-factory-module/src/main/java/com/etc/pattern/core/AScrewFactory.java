package com.etc.pattern.core;


import cn.hutool.core.util.IdUtil;
import com.etc.pattern.pojo.AScrew;
import com.etc.pattern.pojo.AScrewCap;
import com.etc.pattern.pojo.Screw;
import com.etc.pattern.pojo.ScrewCap;

/**
 * 螺母生产线
 * @author chengkexing
 * @version $Id: Pattern.java,v 1.
 */
public class AScrewFactory extends AbstractWorkshopFactory {

    @Override
    public Screw generatorScrew() {
        Screw screw = new AScrew();
        screw.setId(IdUtil.simpleUUID());
        return screw;
    }

    @Override
    public ScrewCap generatorScrewCap() {
        ScrewCap screwCap = new AScrewCap();
        screwCap.setId(IdUtil.simpleUUID());
        return screwCap;
    }
}
