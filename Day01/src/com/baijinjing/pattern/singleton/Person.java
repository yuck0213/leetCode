package com.baijinjing.pattern.singleton;

import com.baijinjing.duoxianchen.Singleton4;

public class Person implements Runnable{
    private static int num=0;

    @Override
    public void run() {
        synchronized (Person.class){
        Singleton5 instance = Singleton5.getInstance();
        System.out.println("第"+num+"次调用"+"对象的hashcode"+instance.hashCode());
            num++;
        }
    }
}
