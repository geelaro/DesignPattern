package com.geelar.pattern.abfactory.pizza;

import com.geelar.pattern.abfactory.PizzaIngredientFactory;

/**
 * 西安店铺特产：羊肉披萨
 */
public class LambPizza extends Pizza {
    private String lambName = "羊肉披萨";
    private PizzaIngredientFactory factory;

    public LambPizza(PizzaIngredientFactory factory) {
        this.factory = factory;
        this.name = lambName;
    }

    @Override
    public void prepare() {
        System.out.println(name + ": Preparing...");
        factory.createDough();
        factory.createCheese();
        factory.createMeat();
    }
}
