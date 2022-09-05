package com.etc.pattern.core;

import com.etc.pattern.pojo.Screw;
import com.etc.pattern.pojo.ScrewCap;

/**
 * 螺丝厂生产车间
 * @author chengkexing
 * @version 1.0
 */
public abstract class AbstractWorkshopFactory {

  public abstract Screw generatorScrew();

  public abstract  ScrewCap generatorScrewCap();
}
