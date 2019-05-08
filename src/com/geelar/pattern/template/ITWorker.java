package com.geelar.pattern.template;

public class ITWorker extends Worker {

    public ITWorker(String name) {
        super(name);
    }

    @Override
    public void work() {
        System.out.println(name+"维修电脑");
    }
}
