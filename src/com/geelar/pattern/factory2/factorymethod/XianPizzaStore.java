package com.geelar.pattern.factory2.factorymethod;

import com.geelar.pattern.factory2.base.HotPizza;
import com.geelar.pattern.factory2.base.Pizza;
import com.geelar.pattern.factory2.base.ApplePizza;
import com.geelar.pattern.factory2.base.LambPizza;

/**
 * 西安肉夹馍分店
 */
public class XianPizzaStore extends PizzaStore {


    @Override
    public Pizza createPizza(String type) {
        Pizza pizza = null;

        if (type.equals("apple")) {
            pizza = new ApplePizza();
        } else if (type.equals("hot")) {
            pizza = new HotPizza();
        } else if (type.equals("lamb")) {
            pizza = new LambPizza();
        } else {
            throw new NullPointerException("无此种披萨");

        }
        return pizza;
    }
}
