package com.baijinjing;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class PrintABC2 {
    static volatile int i = 1;
    public static void main(String[] args) {
        ReentrantLock lock = new ReentrantLock();
        Condition condition = lock.newCondition();

        new Thread(()->{
            try {
                lock.lock();
                for (int j = 0; j < 10; j++) {
                    if (i==1){
                        System.out.println(Thread.currentThread().getName()+"第"+j+"次"+"A");
                        i=2;
                        condition.signalAll();
                    }else{
                        condition.await();
                    }
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                lock.unlock();
            }

        },"t1").start();

        new Thread(()->{
            try {
                lock.lock();
                for (int j = 0; j < 10; j++) {
                    if (i==2){
                        System.out.println(Thread.currentThread().getName()+"第"+j+"次"+"B");
                        i=3;
                        condition.signalAll();
                    }else{
                        condition.await();
                    }
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                lock.unlock();
            }

        },"t2").start();

        new Thread(()->{
            try {
                lock.lock();
                for (int j = 0; j < 10; j++) {
                    if (i==3){
                        System.out.println(Thread.currentThread().getName()+"第"+j+"次"+"C");
                        i=1;
                        condition.signalAll();
                    }else{
                        condition.await();
                    }
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                lock.unlock();
            }

        },"t3").start();
    }
}
