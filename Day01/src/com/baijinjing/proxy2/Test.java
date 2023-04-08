package com.baijinjing.proxy2;

public class Test {
    public static void main(String[] args) {
        Car car = new BYD();
        MyProxy myProxy = new MyProxy();
        myProxy.setTarget(car);
        Car proxy = (Car) myProxy.getProxy();
        proxy.run();
    }
}
