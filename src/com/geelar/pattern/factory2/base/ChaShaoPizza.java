package com.geelar.pattern.factory2.base;

/**
 * 广州店特产：叉烧肉夹馍
 */
public class ChaShaoPizza extends Pizza {
    private String csName = PizzaType.CHASHAO_PIZZA.name;

    public ChaShaoPizza() {
        this.name = csName;
    }
}
