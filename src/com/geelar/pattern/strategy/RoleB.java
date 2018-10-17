package com.geelar.pattern.strategy;

public class RoleB extends  Role{

    private IFlyBehavior flyBehavior;

    public RoleB(String name){
        super();
        this.name = name;
    }

    protected RoleB setFlyBehavior(IFlyBehavior flyBehavior){
        this.flyBehavior = flyBehavior;
        return this;
    }

    public void fly(){
        flyBehavior.fly();
    }
}
