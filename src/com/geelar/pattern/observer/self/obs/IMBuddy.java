package com.geelar.pattern.observer.self.obs;

import com.geelar.pattern.observer.self.Observer;
import com.geelar.pattern.observer.self.Subject;
import com.geelar.pattern.observer.self.sub.UserAction;
import com.geelar.pattern.observer.self.sub.UserBean;

/**
 * IM
 */
public class IMBuddy implements Observer {

    public IMBuddy(UserAction userAction){
        userAction.registerObserver(this);
    }

    @Override
    public void update(Subject s, Object o) {
        if(o instanceof UserBean){
            init((UserBean) o);
        }
    }

    private  void init(UserBean userBean){
        System.out.println(userBean.getName()+"已登入，IM初始化中...");
    }
}
