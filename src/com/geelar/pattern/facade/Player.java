package com.geelar.pattern.facade;

/**
 * 播放器
 */
public class Player {

    public void startUp(){
        System.out.println("打开播放器");

    }

    public void start(){
        System.out.println("启动播放器");

    }

    public void stop(){
        System.out.println("停止播放器");
    }
    public void shutDown(){
        System.out.println("关闭播放器");

    }
}
