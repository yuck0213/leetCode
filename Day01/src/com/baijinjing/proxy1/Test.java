package com.baijinjing.proxy1;

public class Test {
    public static void main(String[] args) {

        Fruit apple = new Apple();
        MyProxy myProxy = new MyProxy();
        myProxy.setTarget(apple);
        Fruit proxy = (Fruit) myProxy.getProxy();
        proxy.eat();

    }
}
