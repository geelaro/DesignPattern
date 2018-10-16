package com.geelar.pattern.observer.self.sub;

import com.geelar.pattern.observer.self.Observer;
import com.geelar.pattern.observer.self.Subject;
import com.geelar.pattern.observer.self.sub.UserBean;

import java.util.ArrayList;
import java.util.List;

/**
 * 用户登录/登出的信息通知订阅者
 */

public class UserAction implements Subject {

    private List<Observer> observers = new ArrayList<>();


    private UserBean userBean;

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        int index = observers.indexOf(observer);
        if (index >= 0) {
            observers.remove(index);
        }
    }

    @Override
    public void notifyObservers() {

        for (Observer o : observers) {
            o.update(this, userBean);
        }
    }

    public void loginSuccess(UserBean userBean){
        this.userBean = userBean;
        //
        notifyObservers();
    }
}
