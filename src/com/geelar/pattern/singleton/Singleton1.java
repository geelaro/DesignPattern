package com.geelar.pattern.singleton;

/**
 * 饿汉模式，线程安全，不是懒加载
 */
public class Singleton1 {
    private static Singleton1 instance = new Singleton1();
    private Singleton1(){}
    public static Singleton1 getInstance(){
        return instance;
    }
}
