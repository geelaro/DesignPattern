package com.geelar.pattern.abfactory;

import com.geelar.pattern.abfactory.store.GZPizzaStore;
import com.geelar.pattern.abfactory.store.PizzaStore;
import com.geelar.pattern.abfactory.store.XianPizzaStore;
import com.geelar.pattern.factory2.base.Pizza;

/**
 * 抽象工厂sample
 */
public class AbstractFactorySample {

    public static void main(String[] args) {

        //广州分店
        PizzaStore gzPizzaStore = new GZPizzaStore();
        gzPizzaStore.sellPizza("chashao");
        gzPizzaStore.sellPizza("cheese");

        //西安分店
        PizzaStore xianStore = new XianPizzaStore();
        xianStore.sellPizza("lamb"); //特色披萨

    }
}
