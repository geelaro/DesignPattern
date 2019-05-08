package com.geelar.pattern.decorator.dtor;

import com.geelar.pattern.decorator.bve.Beverage;

/**
 * 调料类：装饰者类
 */
public abstract class CondimentDecorator extends Beverage {

    public abstract String getDescription();
}
