package com.geelar.pattern.adapter;

public class V220PowerProvider implements  V220Power{

    @Override
    public int providerPower() {
        System.out.println("提供220V电压");
        return 220;
    }
}
