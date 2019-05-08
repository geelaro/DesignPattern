package com.geelar.pattern.facade;

/**
 * 外观模式，以家庭影院为例，一键启动家庭影院
 */
public class HomeTheater {
    private PopcornPopper popper;
    private Projector projector;
    private Player player;

    public HomeTheater(){
        popper  = new PopcornPopper();
        projector = new Projector();
        player = new Player();
    }

    /**
     * 一键观影
     */
    public void watchMovie(){
        /**
         * 1.打开爆米花机
         * 2.制作爆米花
         * 3.打开投影仪
         * 4.启动播放器
         * 5.开始播放
         */
        popper.on();
        popper.makePopcorn();
        projector.on();
        player.startUp();
        player.start();
    }

    /**
     * 停止观影
     */
    public void stopMoive(){
        player.stop();
        player.shutDown();
        projector.off(); //关闭投影仪
        popper.close();//关闭爆米花机
    }

}
