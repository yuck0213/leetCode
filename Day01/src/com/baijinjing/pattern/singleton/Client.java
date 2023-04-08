package com.baijinjing.pattern.singleton;

public class Client {
    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            Person person = new Person();
            Thread t = new Thread(person,"t"+i);
            t.start();
        }
    }
}
