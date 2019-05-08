package com.geelar.pattern.factory2.simplefactory;

import com.geelar.pattern.factory2.base.RouJiaMo;

/***
 * 肉夹馍店铺
 */
public class RouJiaMoStore {

    private SimpleRouJiaMoFactory factory;


    public RouJiaMoStore(SimpleRouJiaMoFactory factory) {
        this.factory = factory;
    }


    /**
     * 根据传入的type返回不同的肉夹馍
     *
     * @param type
     * @return
     */
    public RouJiaMo sellRouJiaMo(String type) {

        RouJiaMo rouJiaMo = factory.createRouJiaMo(type);
        //制作肉夹馍
        rouJiaMo.prepare();
        rouJiaMo.fire();
        rouJiaMo.pack();

        return rouJiaMo;
    }

    /**
     * 演示卖出肉夹馍
     * @param args
     */
    public static void main(String[] args) {

        SimpleRouJiaMoFactory factory = new SimpleRouJiaMoFactory();
        RouJiaMoStore rouJiaMoStore = new RouJiaMoStore(factory);
        rouJiaMoStore.sellRouJiaMo("La");
//        rouJiaMoStore.sellRouJiaMo("Tian");
    }
}
