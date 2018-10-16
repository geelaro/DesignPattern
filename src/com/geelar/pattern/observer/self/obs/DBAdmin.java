package com.geelar.pattern.observer.self.obs;

import com.geelar.pattern.observer.self.Observer;
import com.geelar.pattern.observer.self.Subject;
import com.geelar.pattern.observer.self.sub.UserAction;
import com.geelar.pattern.observer.self.sub.UserBean;

//
public class DBAdmin implements Observer {

    public DBAdmin(UserAction action) {
        action.registerObserver(this);
    }

    @Override
    public void update(Subject s, Object o) {

        if (o instanceof UserBean) {
            recordUser((UserBean) o);
        }
    }

    private void recordUser(UserBean userBean) {
        System.out.println(userBean.getName() + "登录成功，信息存入DB.");
    }
}
