package com.geelar.pattern.decorator;

import com.geelar.pattern.decorator.bve.Beverage;
import com.geelar.pattern.decorator.bve.Espresso;
import com.geelar.pattern.decorator.bve.HouseBlend;
import com.geelar.pattern.decorator.dtor.Chocolate;
import com.geelar.pattern.decorator.dtor.Milk;

public class DecoratorTest {

    public static void main(String[] args) {

        Beverage beverage = new Espresso(); //点一杯浓缩coffee

        System.out.println("不加任何调料：" + beverage.getDescription() + ", " + beverage.cost());

        Beverage blend = new HouseBlend(); //点一杯普通coffee
        blend = new Milk(blend); //加一份牛奶
        blend = new Milk(blend);//再加一份牛奶
        blend = new Chocolate(blend); //再加一份巧克力

        System.out.println("订单：" + blend.getDescription() + ", " + blend.cost());

    }
}
