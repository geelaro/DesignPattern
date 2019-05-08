package com.geelar.pattern.decorator.dtor;

import com.geelar.pattern.decorator.bve.Beverage;


public class Chocolate extends CondimentDecorator {

    private Beverage beverage;

    public Chocolate(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + "+巧克力";
    }

    @Override
    public double cost() {
        return beverage.cost();
    }
}
