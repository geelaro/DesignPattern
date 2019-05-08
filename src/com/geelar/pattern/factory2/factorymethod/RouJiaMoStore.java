package com.geelar.pattern.factory2.factorymethod;

import com.geelar.pattern.factory2.base.RouJiaMo;

/**
 * 工厂方法模式：把类实例化的过程推迟到子类。
 * 定义一个创建对象的接口，但由子类决定要实例化的类是哪一个
 */
public abstract class RouJiaMoStore {

    protected abstract RouJiaMo createRouJiaMo(String type);

    /**
     * 根据传入type不同卖不同类型的肉夹馍
     * @param type
     * @return
     */
    public RouJiaMo sellRouJiaMo(String type){
        RouJiaMo rouJiaMo = createRouJiaMo(type);
        //制作
        rouJiaMo.prepare();
        rouJiaMo.fire();
        rouJiaMo.pack();

        return rouJiaMo;
    }
}
