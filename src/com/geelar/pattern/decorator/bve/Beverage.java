package com.geelar.pattern.decorator.bve;

/**
 * 超类：饮料
 */
public abstract class Beverage {

    String description="Unknown Beverage";

    public String getDescription(){
        return description;
    }

    public abstract double cost();
}
