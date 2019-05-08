package com.geelar.pattern.decorator.bve;


/**
 * 继承饮料类：浓缩咖啡
 */
public class Espresso extends Beverage {

    public Espresso() {
        description = "浓缩咖啡";
    }



    @Override
    public double cost() {
        return 15;
    }
}
