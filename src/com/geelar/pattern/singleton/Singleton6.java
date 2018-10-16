package com.geelar.pattern.singleton;

/**
 * 静态内部类，懒加载，线程安全。
 */
public class Singleton6 {

    private static class SingleHolder{
         static Singleton6 instance = new Singleton6();
    }

    private Singleton6(){}

    public static Singleton6 getInstance(){
        return SingleHolder.instance;
    }
}
