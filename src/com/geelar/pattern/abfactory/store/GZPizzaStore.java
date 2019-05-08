package com.geelar.pattern.abfactory.store;


import com.geelar.pattern.abfactory.GZPizzaIngredientFactory;
import com.geelar.pattern.abfactory.PizzaIngredientFactory;
import com.geelar.pattern.abfactory.pizza.ChaShaoPizza;
import com.geelar.pattern.abfactory.pizza.CheesePizza;
import com.geelar.pattern.abfactory.pizza.HotPizza;
import com.geelar.pattern.abfactory.pizza.Pizza;

/**
 * 广州披萨分店
 */
public class GZPizzaStore extends PizzaStore {

    @Override
    public Pizza createPizza(String type) {
        Pizza pizza = null;
        PizzaIngredientFactory factory = new GZPizzaIngredientFactory();

        if (type.equals("cheese")) {
            pizza = new CheesePizza(factory);
        } else if (type.equals("hot")) {
            pizza = new HotPizza(factory);
        } else if (type.equals("chashao")) {
            pizza = new ChaShaoPizza(factory);
        } else {
            throw new NullPointerException("无此种披萨");

        }
        return pizza;
    }
}
