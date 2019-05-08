package com.geelar.pattern.facade;

/**
 * 爆米花机器
 */
public class PopcornPopper {

    public void on(){
        System.out.println("打开爆米花机");
    }

    public void makePopcorn(){
        System.out.println("开始制作爆米花");
    }

    public void close(){
        System.out.println("关闭爆米花机");
    }
}
