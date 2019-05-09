package com.geelar.pattern.state;

/**
 * 设计模式：状态模式
 */
public class StateTest {

    public static void main(String[] args){

        VendingMachine machine = new VendingMachine(10);
        machine.insertMoney();
        machine.backMoney();

        //模拟中奖
        System.out.println("------出货-------");
        machine.insertMoney();
        machine.turnCrank();
        machine.insertMoney();
        machine.turnCrank();
        machine.insertMoney();
        machine.turnCrank();
        machine.insertMoney();
        machine.turnCrank();
        machine.insertMoney();
        machine.turnCrank();
        machine.insertMoney();
        machine.turnCrank();
        machine.insertMoney();
        machine.turnCrank();
        machine.insertMoney();
        machine.turnCrank();
        System.out.println("商品数: "+machine.getCount());


    }
}
