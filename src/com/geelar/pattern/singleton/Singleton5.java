package com.geelar.pattern.singleton;

/**
 * 双重校验锁，线程安全。
 */
public class Singleton5 {
    private static volatile Singleton5 instance = null;
    private Singleton5(){}

    public static Singleton5 getInstance(){
        if (instance==null){
            synchronized (Singleton5.class){
                if (instance==null){
                    instance = new Singleton5();
                }
            }
        }
        return instance;
    }


}
