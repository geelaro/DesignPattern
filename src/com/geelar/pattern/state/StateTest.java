package com.geelar.pattern.state;

/**
 * 设计模式：状态模式
 */
public class StateTest {

    public static void main(String[] args){

        VendingMachine machine = new VendingMachine(10);
        machine.insertMoney();
        machine.backMoney();



    }
}
