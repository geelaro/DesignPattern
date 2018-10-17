package com.geelar.pattern.adapter;

/**
 * 手机
 */
public class Mobile {
    /**
     * @param power
     */
    public void inputPower(V5Power power) {
        int pvPower = power.providerPower();
        System.out.println("手机需要充电，现在的充电电压是：" + pvPower + "V");
    }
}
