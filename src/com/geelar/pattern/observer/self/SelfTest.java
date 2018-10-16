package com.geelar.pattern.observer.self;

import com.geelar.pattern.observer.self.obs.DBAdmin;
import com.geelar.pattern.observer.self.obs.IMBuddy;
import com.geelar.pattern.observer.self.sub.UserAction;
import com.geelar.pattern.observer.self.sub.UserBean;

/**
 * 用户登录后，把登录信息通知给DBAdmin.
 */
public class SelfTest {

    public static void main(String[] agrs){

        //一个用户
        UserBean userBean = new UserBean("Zhang",34);
        //初始化
        UserAction userAction = new UserAction();//被观察者
        DBAdmin dbAdmin = new DBAdmin(userAction);//观察者
        IMBuddy imBuddy = new IMBuddy(userAction);

        //用户登录成功
        userAction.loginSuccess(userBean);

    }

}
