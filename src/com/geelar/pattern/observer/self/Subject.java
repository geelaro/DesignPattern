package com.geelar.pattern.observer.self;

/**
 * 定义被观察者接口
 */

public interface Subject {

    /**
     * register
     */
    void registerObserver(Observer observer);

    /**
     * 移除一个观察者
     * @param observer
     */
    void removeObserver(Observer observer);

    void notifyObservers();
}
