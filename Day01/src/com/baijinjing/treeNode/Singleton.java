package com.baijinjing.treeNode;

import java.util.Stack;

public class Singleton {
    public static Singleton instance;

    public Singleton(){}

    public static Singleton getInstance(){

        if (instance == null){
            synchronized(Singleton.class){
                if (instance == null){
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }
}
