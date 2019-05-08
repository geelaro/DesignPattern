package com.geelar.pattern.factory2.base;

/**
 * 肉夹馍
 */
public abstract class RouJiaMo {

    protected String name;

    public void prepare() {
        System.out.println(name + ": 和面-发酵-完成准备工作");
    }

    public void pack() {
        System.out.println(name + ": 包装");
    }

    public void fire() {
        System.out.println(name + ": 烘烤制作");
    }

}
