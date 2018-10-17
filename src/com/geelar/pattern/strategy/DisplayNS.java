package com.geelar.pattern.strategy;

public class DisplayNS implements IDisplayBehavior {
    @Override
    public void display() {
        System.out.println("霓裳服");
    }
}
