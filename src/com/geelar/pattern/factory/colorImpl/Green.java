package com.geelar.pattern.factory.colorImpl;

import com.geelar.pattern.factory.inface.Color;

public class Green implements Color {
    @Override
    public void fill() {
        System.out.println("Fill it by green color.");

    }
}
