package com.geelar.pattern.adapter;

public class AdapterPatternTest {
    public static void main(String[] args){
        Mobile mobile = new Mobile();
        V5Power v5Power = new V5PowerAdapter(new V220PowerProvider());
        mobile.inputPower(v5Power);
    }
}
