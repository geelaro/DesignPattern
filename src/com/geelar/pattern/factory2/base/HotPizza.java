package com.geelar.pattern.factory2.base;

/**
 * 辣味肉夹馍
 */
public class HotPizza extends Pizza {

    private String laName = "辣味披萨";

    public HotPizza() {
        this.name = laName;
    }


    @Override
    public void pack() {
        System.out.println(name+": 包装-辣椒");
    }
}
