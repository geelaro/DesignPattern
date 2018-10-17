package com.geelar.pattern.adapter;

/**
 * 适配器，把220V电压转成5V
 */
public class V5PowerAdapter implements V5Power {

    private V220Power v220Power;

    public V5PowerAdapter(V220PowerProvider v220PowerProvider){
        v220Power = v220PowerProvider;
    }

    @Override
    public int providerPower() {
        int power = v220Power.providerPower();
        System.out.println("适配器：已修正"+power+"V电压为5V");
        return 5;
    }
}
