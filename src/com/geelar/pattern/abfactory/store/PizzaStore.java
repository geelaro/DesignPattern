package com.geelar.pattern.abfactory.store;


import com.geelar.pattern.abfactory.pizza.Pizza;

/**
 * 抽象工厂
 */
public abstract class PizzaStore {

    protected abstract Pizza createPizza(String type);

    /**
     * 根据传入type不同卖不同类型的Pizza
     *
     * @param type
     * @return
     */
    public Pizza sellPizza(String type) {
        Pizza pizza = createPizza(type);
        //制作
        pizza.prepare();
        pizza.fire();
        pizza.cut();
        pizza.pack();

        return pizza;
    }
}
