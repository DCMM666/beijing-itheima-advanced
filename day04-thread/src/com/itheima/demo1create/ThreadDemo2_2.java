package com.itheima.demo1create;

public class ThreadDemo2_2 {
    public static void main(String[] args) {
        // 目标：掌握多线程的创建方式二：使用Runnable接口的匿名内部类来创建
//        Thread thread = new Thread(()->{
//            for (int i = 0; i <10 ; i++) {
//                System.out.println("新线程:"+i);
//            }
//        });
        //thread.start();
        new Thread(()->{
            for (int i = 0; i <10 ; i++) {
                System.out.println("新线程:"+i);
            }
        }).start();
        for (int i = 0; i <10 ; i++) {
            System.out.println("main线程:"+i);
        }
    }
}

