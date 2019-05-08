package com.geelar.pattern.abfactory.pizza;

import com.geelar.pattern.abfactory.PizzaIngredientFactory;

/**
 * 苹果披萨
 */
public class CheesePizza extends Pizza {
    private PizzaIngredientFactory factory;

    private String appleName = "芝士披萨";

    public CheesePizza(PizzaIngredientFactory factory) {
        super.name = appleName;
        this.factory = factory;
    }

    @Override
    public void prepare() {
        System.out.println(name + ": Preparing...");
        factory.createCheese();
        factory.createDough();
    }
}
