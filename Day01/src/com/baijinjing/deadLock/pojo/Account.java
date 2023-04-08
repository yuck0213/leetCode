package com.baijinjing.deadLock.pojo;

import java.util.concurrent.atomic.AtomicInteger;

public class Account {
    private int id;
    private String name;
    private static int balance;

    public Account(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public Account() {    }

    public void transfer(Account target, int amount) throws InterruptedException {
        synchronized (this){
            System.out.println(Thread.currentThread().getName()+"begin");
            Thread.sleep(2000);
            synchronized (target){
                this.balance-=amount;
                target.balance+=amount;
                System.out.println(Thread.currentThread().getName()+"end");
            }
        }
    }

}
