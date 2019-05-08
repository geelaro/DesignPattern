package com.geelar.pattern.decorator.bve;


/**
 * 家常咖啡
 */
public class HouseBlend extends Beverage {
    public HouseBlend() {
        description = "咖啡";
    }

    @Override
    public double cost() {
        return 12;
    }
}
