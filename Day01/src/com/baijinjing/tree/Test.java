package com.baijinjing.tree;

public class Test {
    public static void main(String[] args) {

        Tree234 tree234 = new Tree234();

        tree234.insert(50);
        tree234.insert(40);
        tree234.insert(30);
        tree234.insert(20);
        tree234.insert(80);
        tree234.insert(70);
        tree234.insert(65);
        tree234.insert(45);
        tree234.insert(35);

        tree234.displayTree();
    }
}
