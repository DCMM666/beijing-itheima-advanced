package com.itheima.blockqueue;

import java.util.concurrent.ArrayBlockingQueue;

public class Cooker extends Thread{
    ArrayBlockingQueue<String> cooker;

    public Cooker(ArrayBlockingQueue<String> cooker) {
        this.cooker = cooker;
    }

    public Cooker(String name, ArrayBlockingQueue<String> cooker) {
        super(name);
        this.cooker = cooker;
    }

    @Override
    public void run() {
        while (true){
            try {
                cooker.put("面条");
                System.out.println(getName()+"做了一碗面条");
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        
    }
}
