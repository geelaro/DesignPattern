package com.geelar.pattern.strategy;

/**
 * 飞行技能：跟斗云
 */
public class FlyGDY implements IFlyBehavior  {
    @Override
    public void fly() {
        System.out.println("跟斗云");
    }
}
