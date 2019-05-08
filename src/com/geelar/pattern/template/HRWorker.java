package com.geelar.pattern.template;

public class HRWorker extends Worker {

    public HRWorker(String name) {
        super(name);
    }

    @Override
    public void work() {
        System.out.println(name + "招聘员工");
    }
}
