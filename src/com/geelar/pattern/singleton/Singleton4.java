package com.geelar.pattern.singleton;

/**
 * 懒汉式，线程不安全
 */
public class Singleton4 {
    private static Singleton4 instance =null;

    private Singleton4(){}

    public static  Singleton4 getInstance(){
        if (instance==null){
            synchronized (Singleton4.class) {
                instance = new Singleton4();
            }
        }
        return instance;
    }

}
