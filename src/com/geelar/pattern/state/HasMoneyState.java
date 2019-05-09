package com.geelar.pattern.state;

import java.util.Random;

public class HasMoneyState implements State {

    private VendingMachine machine;
    private Random random = new Random();

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
        System.out.println("转动了手柄");
        //幸运用户，概率10%
        int winner = random.nextInt(10);
        System.out.println("winner: " + winner);
        if (winner == 0 && machine.getCount() > 1) {
            machine.setCurrentState(machine.getWinnerState());
        } else {
            machine.setCurrentState(machine.getSoldState());
        }
    }

    @Override
    public void dispense() {
        throw new IllegalStateException("非法状态");
    }
}
