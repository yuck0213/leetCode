package com.baijinjing.user;

import java.lang.ref.SoftReference;


public class Test {
    static ThreadLocal<User> threadLocal = new ThreadLocal<>();
    public static void main(String[] args) {
        SoftReference<byte[]> sr = new SoftReference<>(new byte[1024*1024*10]);
        System.gc();
        System.out.println(sr.get());
        byte[] bytes = new byte[1024*1024*12];
        System.out.println(sr.get());

        new Thread(()->{
            try {
                Thread.sleep(1000);
                threadLocal.set(new User(13,"huge"));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }).start();

        new Thread(()->{
            try {
                Thread.sleep(2000);
                System.out.println(threadLocal.get());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }).start();
    }
}
