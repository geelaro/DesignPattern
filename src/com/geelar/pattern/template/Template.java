package com.geelar.pattern.template;

public class Template {

    public static void main(String[] args){
        Worker it = new ITWorker("李工");
        it.workOnOneDay();

        Worker hr = new HRWorker("Sara");
        hr.workOnOneDay();

        Worker pm = new ManagerWorker("Kevin");
        pm.workOnOneDay();
    }
}
