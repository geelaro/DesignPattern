package com.geelar.pattern.state;

public class NoMoneyState implements State {

    private VendingMachine machine;

    public NoMoneyState(VendingMachine machine) {
        this.machine = machine;
    }

    @Override
    public void insertMoney() {
        System.out.println("投币成功");
        machine.setCurrentState(machine.getHasMoneyState());

    }

    @Override
    public void backMoney() {
        System.out.println("未投币，无法退钱！");
    }

    @Override
    public void turnCrank() {
        System.out.println("未投币，无法旋转");
    }

    @Override
    public void dispense() {
        throw new IllegalStateException("非法状态");
    }
}
