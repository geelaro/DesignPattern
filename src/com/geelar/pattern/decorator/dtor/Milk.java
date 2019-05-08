package com.geelar.pattern.decorator.dtor;

import com.geelar.pattern.decorator.bve.Beverage;

/**
 * 牛奶
 */
public class Milk extends CondimentDecorator {

    private Beverage beverage;

    public Milk(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + "+牛奶";
    }

    @Override
    public double cost() {
        return beverage.cost() + 5.0;
    }
}
