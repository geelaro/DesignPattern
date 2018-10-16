package com.geelar.pattern.singleton;

/**
 * 枚举 ，推荐
 */
public enum  Singleton7 {
    instance;
    private Singleton7(){}

    public void print(){
        System.out.println(this.getClass().getName());
    }

}
