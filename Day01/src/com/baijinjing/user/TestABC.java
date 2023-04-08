package com.baijinjing.user;

public class TestABC {
    static volatile int i = 1;

    public static void main(String[] args) {
        Object o = new Object();
        Thread t1 = new Thread(() -> {
            synchronized (o) {
                for (int j = 0; j <10 ; j++) {
                    while (i != 1) {
                        try {
                            o.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                    System.out.println(Thread.currentThread().getName() + ": A");
                    i = 2;
                    o.notifyAll();
                }
            }
        }, "t1");

        Thread t2 = new Thread(() -> {
            synchronized (o) {
                for (int j = 0; j < 10; j++) {
                    while (i != 2) {
                        try {
                            o.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                    System.out.println(Thread.currentThread().getName() + ": B");
                    i = 3;
                    o.notifyAll();
                }
            }


        }, "t2");

        Thread t3 = new Thread(() -> {
            synchronized (o) {
                for (int j = 0; j < 10; j++) {
                    while (i != 3) {
                        try {
                            o.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                    System.out.println(Thread.currentThread().getName() + ": C");
                    i = 1;
                    o.notifyAll();
                }
            }
        }, "t3");


        t1.start();
        t2.start();
        t3.start();
    }
}
