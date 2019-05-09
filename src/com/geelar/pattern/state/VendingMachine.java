package com.geelar.pattern.state;

public class VendingMachine {

    private NoMoneyState noMoneyState;
    private HasMoneyState hasMoneyState;
    private SoldState soldState;
    private SoldOutState soldoutState;
    private WinnerState winnerState;

    private int count = 0;
    private State currentState = null;

    public SoldState getSoldState() {
        return soldState;
    }

    public void setSoldState(SoldState soldState) {
        this.soldState = soldState;
    }

    public SoldOutState getSoldoutState() {
        return soldoutState;
    }

    public void setSoldoutState(SoldOutState soldoutState) {
        this.soldoutState = soldoutState;
    }

    public VendingMachine(int count) {

        noMoneyState = new NoMoneyState(this);
        hasMoneyState = new HasMoneyState(this);
        soldoutState = new SoldOutState(this);
        soldState = new SoldState(this);
        winnerState = new WinnerState(this);

        if (count > 0) {
            this.count = count;
            currentState = noMoneyState;
        }
    }


    public void insertMoney() {
        currentState.insertMoney();
    }


    public void backMoney() {
        currentState.backMoney();
    }

    public void turnCrank() {
        currentState.turnCrank();
        if (currentState == soldState || currentState == winnerState) {
            //如果是出货状态，请出货
            currentState.dispense();
        }

    }

    public void dispense() {
        System.out.println("发出一件商品");
        if (count != 0) {
            count -= 1;
        }
    }

    public NoMoneyState getNoMoneyState() {
        return noMoneyState;
    }

    public void setNoMoneyState(NoMoneyState noMoneyState) {
        this.noMoneyState = noMoneyState;
    }

    public HasMoneyState getHasMoneyState() {
        return hasMoneyState;
    }

    public void setHasMoneyState(HasMoneyState hasMoneyState) {
        this.hasMoneyState = hasMoneyState;
    }


    public State getCurrentState() {
        return currentState;
    }

    public void setCurrentState(State currentState) {
        this.currentState = currentState;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public WinnerState getWinnerState() {
        return winnerState;
    }

    public void setWinnerState(WinnerState winnerState) {
        this.winnerState = winnerState;
    }
}
