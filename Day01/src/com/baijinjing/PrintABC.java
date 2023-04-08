package com.baijinjing;

public class PrintABC {

    static volatile int i = 1;

    public static void main(String[] args) {
        Object o = new Object();

        new Thread(()->{
            synchronized (o){
                for (int j = 0; j < 10; j++) {
                    while (i!=1){
                        try {
                            o.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                    System.out.println(Thread.currentThread().getName()+"第"+(j+1)+"次:A");
                    i=2;
                    o.notifyAll();
                }
            }
        },"t1").start();

        new Thread(()->{
            synchronized (o){
                for (int j = 0; j < 10; j++) {
                    while (i!=2){
                        try {
                            o.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                    System.out.println(Thread.currentThread().getName()+"第"+(j+1)+"次:B");
                    i=3;
                    o.notifyAll();
                }
            }
        },"t2").start();

        new Thread(()->{
            synchronized (o){
                for (int j = 0; j < 10; j++) {
                    while (i!=3){
                        try {
                            o.wait();
                        } catch (InterruptedException e) {
                            e. printStackTrace();
                        }
                    }
                    System.out.println(Thread.currentThread().getName()+"第"+(j+1)+"次:C");
                    i=1;
                    o.notifyAll();
                }
            }
        },"t3").start();
    }
}
