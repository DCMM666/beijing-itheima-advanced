package com.itheima.demo1create;

public class ThreadDemo1 {
    // main方法本身是由一条主线程负责推荐执行的。
    public static void main(String[] args) {
        // 目标：认识多线程，掌握创建线程的方式一：继承Thread类来实现
        Thread1 t1 = new Thread1();
        t1.start();
        for (int i = 0; i < 10; i++) {
            System.out.println("main线程"+i);
        }
    }
}
class Thread1 extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("新线程:"+i);
        }
    }
}