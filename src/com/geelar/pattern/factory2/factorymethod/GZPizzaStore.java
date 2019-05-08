package com.geelar.pattern.factory2.factorymethod;

import com.geelar.pattern.factory2.base.ChaShaoPizza;
import com.geelar.pattern.factory2.base.HotPizza;
import com.geelar.pattern.factory2.base.Pizza;
import com.geelar.pattern.factory2.base.ApplePizza;

/**
 * 广州披萨分店
 */
public class GZPizzaStore extends PizzaStore {

    @Override
    public Pizza createPizza(String type) {
        Pizza pizza = null;
        if (type.equals("cheese")) {
            pizza = new ApplePizza();
        } else if (type.equals("hot")) {
            pizza = new HotPizza();
        } else if (type.equals("chashao")){
            pizza = new ChaShaoPizza();
        }else {
            throw new NullPointerException("无此种披萨");

        }
        return pizza;
    }
}
