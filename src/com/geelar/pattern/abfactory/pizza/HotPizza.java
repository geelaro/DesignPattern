package com.geelar.pattern.abfactory.pizza;

import com.geelar.pattern.abfactory.PizzaIngredientFactory;

/**
 * 辣味披萨
 */
public class HotPizza extends Pizza {

    private String laName = "辣味披萨";
    private PizzaIngredientFactory factory;

    public HotPizza(PizzaIngredientFactory factory) {
        this.factory = factory;
        this.name = laName;
    }


    @Override
    public void prepare() {
        System.out.println(name + ": Preparing...");
        factory.createDough();
        factory.createCheese();
    }

    @Override
    public void pack() {
        System.out.println(name + ": 包装-辣椒");
    }
}
