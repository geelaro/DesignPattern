package com.geelar.pattern.factory2.base;

/**
 * 辣味肉夹馍
 */
public class LaRouJiaMo extends RouJiaMo {

    private String laName = "辣味肉夹馍";

    public LaRouJiaMo() {
        this.name = laName;
    }


    @Override
    public void pack() {
        System.out.println(name+": 包装-辣椒");
    }
}
