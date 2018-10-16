package com.geelar.pattern.observer.offical;

import com.geelar.pattern.observer.offical.Observer1;
import com.geelar.pattern.observer.offical.Observer2;
import com.geelar.pattern.observer.offical.SubjectFor3D;

public class Test {

    public static void main(String[] args){
        //被观察者
        SubjectFor3D subjectFor3D = new SubjectFor3D();

        //观察者1
        Observer1 observer1 = new Observer1();
        observer1.registerSubject(subjectFor3D);
        //观察者2
        Observer2 observer2 = new Observer2();
        observer2.registerSubject(subjectFor3D);

        //被观察者变化
        subjectFor3D.setMsg("中奖号码是：5678");
    }
}
