package com.geelar.pattern.command.app;

/**
 * 门
 */
public class Door {
    private String name;

    public Door(String name) {
        this.name = name;
    }

    public Door() {
        name = "";
    }

    public void open() {
        System.out.println("打开" + name + "门");
    }

    public void close() {
        System.out.println("关闭" + name + "门");
    }

}
