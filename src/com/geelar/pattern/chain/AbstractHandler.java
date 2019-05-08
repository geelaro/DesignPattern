package com.geelar.pattern.chain;

public abstract class AbstractHandler {

    protected AbstractHandler nextHandler;

    public AbstractHandler(){

    }


    public AbstractHandler(AbstractHandler nextHandler){
        this.nextHandler = nextHandler;
    }


    public abstract void handle(String user,int fee);

    public void setNextAbstractHandler(AbstractHandler nextHandler){
        this.nextHandler = nextHandler;
    }


}
