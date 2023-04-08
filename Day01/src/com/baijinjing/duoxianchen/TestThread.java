package com.baijinjing.duoxianchen;

import java.util.concurrent.*;

public class TestThread {
    public static void main(String[] args) {
        ThreadPoolExecutor executor = new ThreadPoolExecutor(
                2,
                4,
                10,
                TimeUnit.SECONDS,
                new ArrayBlockingQueue<>(2),
                new ThreadFactory() {
                    @Override
                    public Thread newThread(Runnable r) {
                        Thread t = new Thread(r);
                        t.setName("121");
                        return t;
                    }
                },
                new ThreadPoolExecutor.AbortPolicy()
        );

    }
}
