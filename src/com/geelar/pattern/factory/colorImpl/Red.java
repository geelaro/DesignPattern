package com.geelar.pattern.factory.colorImpl;

import com.geelar.pattern.factory.inface.Color;

public class Red implements Color {
    @Override
    public void fill() {
        System.out.println("Fill it by red color.");
    }
}
