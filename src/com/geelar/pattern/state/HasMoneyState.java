package com.geelar.pattern.state;

public class HasMoneyState implements State {

    public VendingMachine machine;

    public HasMoneyState(VendingMachine machine) {
        this.machine = machine;
    }

    @Override
    public void insertMoney() {
        System.out.println("已投币，请勿重复操作");
    }

    @Override
    public void backMoney() {
        System.out.println("退钱成功");
        machine.setCurrentState(machine.getNoMoneyState());
    }

    @Override
    public void turnCrank() {

    }

    @Override
    public void dispense() {

    }
}
