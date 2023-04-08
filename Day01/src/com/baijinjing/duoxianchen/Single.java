package com.baijinjing.duoxianchen;

public class Single {

    public static String s;

    private Single() {
        System.out.println("Single创建了");
    }

    private static class SingleInner {
        private static final Single INSTANCE = new Single();

    }

    public static Single getSingle() {
        return SingleInner.INSTANCE;
    }
}
