package com.baijinjing.deadLock;

import com.baijinjing.deadLock.pojo.Account;

public class DeadLockDemo {
    public static void main(String[] args) {
        Account zhang = new Account(1,"张三");
        Account li = new Account(2,"李四");

        new Thread(()->{
            try {
                zhang.transfer(li,50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        },"t1").start();

        new Thread(()->{
            try {
                li.transfer(zhang,50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        },"t2").start();
    }
}
