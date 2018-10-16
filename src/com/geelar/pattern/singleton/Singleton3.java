package com.geelar.pattern.singleton;

/**
 * 懒汉式，线程安全，效率低。
 */
public class Singleton3 {
    private static Singleton3 instance =null;

    private Singleton3(){
        System.out.println("hashcode: "+this.hashCode());
    }

    public static synchronized Singleton3 getInstance(){
        if (instance==null){
            instance = new Singleton3();
        }
        return instance;
    }
}
