package com.baijinjing.pattern.singleton;

public class Singleton1 {

    private static Singleton1 instance;

    private Singleton1(){}


    static{
        instance = new Singleton1();
    }
    public static Singleton1 getInstance(){
        return instance;
    }
}
