package com.baijinjing.duoxianchen;

public class Person implements Runnable{
    private int i = 1000;
    @Override
    public void run() {
        synchronized (Person.class){
            while (true){
                if (i > 0){
                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(Thread.currentThread().getName()+"第"+i);
                    i--;
                }
            }
        }

    }
}
