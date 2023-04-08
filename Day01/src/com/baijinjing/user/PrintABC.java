package com.baijinjing.user;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class PrintABC {
    volatile static int i = 1;

    public static void main(String[] args) {
        ReentrantLock lock = new ReentrantLock();
        Condition condition = lock.newCondition();

        new Thread(() -> {
            try {
                lock.lock();
                for (int j = 0; j < 10; ) {
                    if (i == 1) {
                        System.out.println(Thread.currentThread().getName() + ": A");
                        j++;
                        i = 2;
                        condition.signalAll();
                    } else {
                        condition.await();
                    }
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                lock.unlock();
            }

        }, "t1").start();

        new Thread(() -> {
            try {
                lock.lock();
                for (int j = 0; j < 10;) {
                    if (i == 2) {
                        System.out.println(Thread.currentThread().getName() + ": B");
                        j++;
                        i = 3;
                        condition.signalAll();
                    } else {
                        condition.await();
                    }
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                lock.unlock();
            }
        }, "t2").start();

        new Thread(() -> {
            try {
                lock.lock();
                for (int j = 0; j < 10;) {
                    if (i == 3) {
                        System.out.println(Thread.currentThread().getName() + ": C");
                        j++;
                        i = 1;
                        condition.signalAll();
                    } else {
                        condition.await();
                    }
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }finally {
                lock.unlock();
            }
        }, "t3").start();
    }
}
