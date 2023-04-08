package com.baijinjing.duoxianchen;

public class Singleton {

    public static Singleton instance = new Singleton();

    public Singleton(){
    }
    public Singleton getInstance(){
        return instance;
    }
}
