package com.baijinjing.duoxianchen;

public class Singleton3 {
    public static Singleton3 instance;

    public Singleton3(){}

    public Singleton3 getInstance(){
        synchronized (Singleton3.class){
            if (instance == null){
                instance = new Singleton3();
            }
        }
        return instance;
    }
}
