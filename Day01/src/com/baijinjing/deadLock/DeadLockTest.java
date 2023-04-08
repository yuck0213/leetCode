package com.baijinjing.deadLock;

public class DeadLockTest implements Runnable{
    static Object lock1 = new Object();
    static Object lock2 = new Object();
    int flag ;

    public DeadLockTest(int flag) {
        this.flag = flag;
    }

    @Override
    public void run() {
        if (flag==0){
            synchronized (lock1){
                try {
                    System.out.println(Thread.currentThread()+"获取到锁"+lock1.toString());
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                synchronized (lock2){
                    System.out.println(Thread.currentThread()+"获取到锁"+lock2.toString());
                }
            }
        }else if(flag==1){
            synchronized (lock2){
                try {
                    System.out.println(Thread.currentThread()+"获取到锁"+lock2.toString());
                    Thread.sleep(500);

                } catch (InterruptedException e) {
                }
                synchronized (lock1){
                    System.out.println(Thread.currentThread()+"获取到锁"+lock1.toString());
                }
            }
        }
    }

    public static void main(String[] args) {
        DeadLockTest user1 = new DeadLockTest(0);
        DeadLockTest user2 = new DeadLockTest(1);


        Thread t1 = new Thread(user1);
        Thread t2 = new Thread(user2);

        t1.start();
        t2.start();
    }
}
