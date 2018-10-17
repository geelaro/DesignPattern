package com.geelar.pattern.factory.colorImpl;

import com.geelar.pattern.factory.inface.Color;

public class Blue implements Color {
    @Override
    public void fill() {
        System.out.println("Fill it by blue color.");
    }
}
