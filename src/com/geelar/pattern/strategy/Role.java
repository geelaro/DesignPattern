package com.geelar.pattern.strategy;

/**
 * 游戏角色
 */
public abstract class Role {

    protected String name;

    private IDisplayBehavior displayBehavior;
    private IAttackBehavior attackBehavior;
    private IRunBehavior runBehavior;
    private IDefendBehavior defendBehavior;

    public Role setDisplayBehavior(IDisplayBehavior displayBehavior) {
        this.displayBehavior = displayBehavior;
        return this;
    }

    public Role setAttackBehavior(IAttackBehavior attackBehavior) {
        this.attackBehavior = attackBehavior;
        return this;
    }

    public Role setRunBehavior(IRunBehavior runBehavior) {
        this.runBehavior = runBehavior;
        return this;
    }

    public Role setDefendBehavior(IDefendBehavior defendBehavior) {
        this.defendBehavior = defendBehavior;
        return this;
    }


    protected void run() {
        runBehavior.run();
    }

    protected void display() {
        displayBehavior.display();
    }

    protected void defend() {
        defendBehavior.defend();
    }

    protected void attack() {
        attackBehavior.attack();
    }
}
