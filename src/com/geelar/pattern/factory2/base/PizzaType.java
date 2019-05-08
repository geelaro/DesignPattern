package com.geelar.pattern.factory2.base;

public enum PizzaType {
    CHESE_PIZZA("芝士披萨"),
    HOT_PIZZA("辣式披萨"),
    LAMB_PIZZA("羊肉披萨"),
    CHASHAO_PIZZA("叉烧披萨");

    String name;

    PizzaType(String name){
        this.name = name;
    }

}
