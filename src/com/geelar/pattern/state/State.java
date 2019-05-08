package com.geelar.pattern.state;
/**
 *自动售货机的状态
 */
public interface State {

    /**
     * 投币
     */
    void insertMoney();

    void backMoney();

    void turnCrank();

    void dispense();


}
