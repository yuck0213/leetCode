package com.baijinjing.deadLock;

public class DeadLockTest2 {
    public static void main(String[] args) {
        Object o1 = new Object();
        Object o2 = new Object();

         new Thread(()->{
            synchronized (o1){
                try {
                    System.out.println(Thread.currentThread().getName()+"获取o1锁");
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                synchronized (o2){
                    System.out.println(Thread.currentThread().getName()+"获取o2锁");
                }
            }
        },"t1").start();


        new Thread(()->{
            synchronized (o2){
                try {
                    System.out.println(Thread.currentThread().getName()+"获取o2锁");
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                synchronized (o1){
                    System.out.println(Thread.currentThread().getName()+"获取o1锁");
                }
            }
        },"t2").start();
    }
}
