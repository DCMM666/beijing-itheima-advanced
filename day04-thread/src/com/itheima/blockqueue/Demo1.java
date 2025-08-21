package com.itheima.blockqueue;

import java.util.concurrent.ArrayBlockingQueue;

public class Demo1 {
    public static void main(String[] args) {
        ArrayBlockingQueue<String> arrayBlockingQueue = new ArrayBlockingQueue<>(1);
        Cooker cooker = new Cooker("厨师",arrayBlockingQueue);
        Foodies foodies = new Foodies(arrayBlockingQueue);
        cooker.start();
        foodies.start();
    }

}
