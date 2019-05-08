package com.geelar.pattern.abfactory.pizza;

import com.geelar.pattern.abfactory.PizzaIngredientFactory;

/**
 * 广州店特产：叉烧披萨
 */
public class ChaShaoPizza extends Pizza {
    private String csName = PizzaType.CHASHAO_PIZZA.name;

    private PizzaIngredientFactory factory;

    public ChaShaoPizza(PizzaIngredientFactory factory) {
        this.name = csName;
        this.factory = factory;
    }

    @Override
    public void prepare() {
        System.out.println(name + ": 原料准备中...");
        factory.createCheese();
        factory.createDough();
        factory.createMeat();
    }
}
