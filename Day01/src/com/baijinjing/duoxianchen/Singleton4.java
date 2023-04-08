package com.baijinjing.duoxianchen;

public class Singleton4 {
    public static Singleton4 instance;

    public Singleton4(){}

    public static Singleton4 getInstance(){
        if (instance==null){
            synchronized(Singleton4.class){
                if (instance==null){
                    instance = new Singleton4();
                }
            }
        }
        return instance;
    }
}
