package com.baijinjing.duoxianchen;

public class Singleton2 {
    public static Singleton2 instance;

    public Singleton2(){}

    public Singleton2 getInstance(){
        if (instance == null) {
            instance = new Singleton2();
        }
        return instance;
    }
}
