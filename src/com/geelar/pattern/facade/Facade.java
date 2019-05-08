package com.geelar.pattern.facade;

/**
 * 外观模式
 */
public class Facade {
    public static void main(String[] args){

        HomeTheater theater = new HomeTheater();
        theater.watchMovie();
    }
}
