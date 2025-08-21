package com.itheima.demo6_lock;

public class Test {
    public static void main(String[] args) {
        cook cook = new cook("厨师");
        Consumer consumer = new Consumer("吃货");
        cook.start();
        consumer.start();
    }
}
