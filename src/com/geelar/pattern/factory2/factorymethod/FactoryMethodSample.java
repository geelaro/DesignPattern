package com.geelar.pattern.factory2.factorymethod;

/**
 * 工厂方法
 */
public class FactoryMethodSample {

    public static void main(String[] args){
        RouJiaMoStore xianStore = new XianRouJiaMoStore();
        RouJiaMoStore gzStore = new GZRouJiaMoStore();

        xianStore.sellRouJiaMo("La");
        gzStore.sellRouJiaMo("Chashao");
    }
}
