package com.geelar.pattern.template;

/**
 * 模板设计模式
 */

public abstract class Worker {

    protected String name;

    public Worker(String name){
        this.name = name;
    }

    public final void workOnOneDay(){
        System.out.println("****开始一天的工作****");
        enterOffice();
        computerOn();
        work();
        computerOff();
        leaveOffice();
        System.out.println("****结束一天的工作****");
    }

    public abstract void work();

    private void computerOn(){
        System.out.println(name+"打开电脑");
    }

    private void computerOff(){
        System.out.println(name+"关闭电脑");
    }

    public void enterOffice(){
        System.out.println(name+"进入公司");
    }

    public void leaveOffice(){
        System.out.println(name+"离开公司");
    }
}
