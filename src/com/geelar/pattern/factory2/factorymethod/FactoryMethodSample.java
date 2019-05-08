package com.geelar.pattern.factory2.factorymethod;

/**
 * 工厂方法
 */
public class FactoryMethodSample {

    public static void main(String[] args){
        PizzaStore xianStore = new XianPizzaStore();
        PizzaStore gzStore = new GZPizzaStore();

        xianStore.sellPizza("hot");
        gzStore.sellPizza("chashao");
    }
}
