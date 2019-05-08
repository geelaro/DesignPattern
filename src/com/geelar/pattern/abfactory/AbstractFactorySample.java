package com.geelar.pattern.abfactory;

import com.geelar.pattern.abfactory.store.GZPizzaStore;
import com.geelar.pattern.abfactory.store.PizzaStore;

/**
 * 抽象工厂sample
 */
public class AbstractFactorySample {

    public static void main(String[] args) {

        PizzaStore pizzaStore = new GZPizzaStore();
        pizzaStore.sellPizza("chashao");
        pizzaStore.sellPizza("cheese");

    }
}
