package com.geelar.pattern.abfactory.store;

import com.geelar.pattern.abfactory.PizzaIngredientFactory;
import com.geelar.pattern.abfactory.XianPizzaIngredientFactory;
import com.geelar.pattern.abfactory.pizza.CheesePizza;
import com.geelar.pattern.abfactory.pizza.HotPizza;
import com.geelar.pattern.abfactory.pizza.LambPizza;
import com.geelar.pattern.abfactory.pizza.Pizza;

/**
 * 西安肉夹馍分店
 */
public class XianPizzaStore extends PizzaStore {


    @Override
    public Pizza createPizza(String type) {
        Pizza pizza = null;
        PizzaIngredientFactory factory = new XianPizzaIngredientFactory();

        if (type.equals("cheese")) {
            pizza = new CheesePizza(factory);
        } else if (type.equals("hot")) {
            pizza = new HotPizza(factory);
        } else if (type.equals("lamb")) {
            pizza = new LambPizza(factory);
        } else {
            throw new NullPointerException("无此种披萨");

        }
        return pizza;
    }
}
