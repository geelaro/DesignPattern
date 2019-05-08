package com.geelar.pattern.factory2.simplefactory;

import com.geelar.pattern.factory2.base.HotPizza;
import com.geelar.pattern.factory2.base.Pizza;
import com.geelar.pattern.factory2.base.ApplePizza;

/**
 * 简单工厂模式
 */
public class SimplePizzaFactory {


    public Pizza createPizza(String type) {
        Pizza pizza = null;

        if (type.equals("apple")) {
            pizza = new ApplePizza();
        } else if (type.equals("hot")) {
            pizza = new HotPizza();
        } else {
            throw new NullPointerException("无此种Pizza");

        }
        return pizza;
    }
}
