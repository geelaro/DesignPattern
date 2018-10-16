package com.geelar.pattern.singleton;

import com.geelar.pattern.observer.offical.SubjectFor3D;
import com.geelar.pattern.observer.self.obs.DBAdmin;

public class SingletonTest {

    public static void main(String[] args) {
        Singleton4 s1 = Singleton4.getInstance();
        for (int i = 0; i < 1; i++) {
            new Thread(() -> {
                Singleton4 s2 = Singleton4.getInstance();

                System.out.println(Thread.currentThread().getId() + ", s2: " + s2.hashCode());

            }).start();

            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println(Thread.currentThread().getId() + ", s1: " + s1.hashCode());

        Singleton7.instance.print();
    }
}
