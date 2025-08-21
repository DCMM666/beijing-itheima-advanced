package com.itheima.demo1create;

public class ThreadDemo2 {
    public static void main(String[] args) {
        // 目标：掌握多线程的创建方式二：实现Runnable接口来创建。
        Thread2 t2 = new Thread2();
        Thread thread = new Thread(t2);
        thread.start();
        for (int i = 0; i < 10; i++) {
            System.out.println("main线程:"+i);
        }
    }
}
class Thread2 implements Runnable{

    @Override
    public void run() {
        for (int i = 0; i < 10 ; i++) {
            System.out.println("新线程:"+i);
        }
    }
}
