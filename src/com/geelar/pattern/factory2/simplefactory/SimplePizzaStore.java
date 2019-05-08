package com.geelar.pattern.factory2.simplefactory;

import com.geelar.pattern.factory2.base.Pizza;

/***
 * pizza店铺
 */
public class SimplePizzaStore {

    private SimplePizzaFactory factory;


    public SimplePizzaStore(SimplePizzaFactory factory) {
        this.factory = factory;
    }


    /**
     * 根据传入的type返回不同的披萨
     *
     * @param type
     * @return
     */
    public Pizza sellPizza(String type) {

        Pizza pizza = factory.createPizza(type);
        //制作pizza
        pizza.prepare();
        pizza.fire();
        pizza.pack();

        return pizza;
    }

    /**
     * 演示简单工厂 卖披萨
     * @param args
     */
    public static void main(String[] args) {

        SimplePizzaFactory factory = new SimplePizzaFactory();
        SimplePizzaStore pizzaStore = new SimplePizzaStore(factory);
        pizzaStore.sellPizza("hot");
//        pizzaStore.sellRouJiaMo("Tian");
    }
}
