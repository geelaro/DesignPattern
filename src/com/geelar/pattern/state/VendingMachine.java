package com.geelar.pattern.state;

public class VendingMachine {

    private NoMoneyState noMoneyState;
    private HasMoneyState hasMoneyState;

    private int count = 0;
    private State currentState = null;

    public VendingMachine(int count) {

        noMoneyState = new NoMoneyState(this);
        hasMoneyState = new HasMoneyState(this);

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

    }

    public void dispense(){
        currentState.dispense();
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

}
