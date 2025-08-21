package com.itheima.blockqueue;

import java.util.concurrent.ArrayBlockingQueue;

public class Foodies extends Thread {
    ArrayBlockingQueue<String> food;

    public Foodies(ArrayBlockingQueue<String> food) {
        this.food = food;
    }

    @Override
    public void run() {
        while (true){
            try {
                String foods = food.take();
                System.out.println(foods);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
