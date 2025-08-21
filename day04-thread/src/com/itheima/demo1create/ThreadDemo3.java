package com.itheima.demo1create;

import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;

public class ThreadDemo3 {
    public static void main(String[] args) throws Exception {
        // 目标：掌握多线程的创建方式三：实现Callable接口，方式三的优势：可以获取线程执行完毕后的结果的。
        // 3、创建一个Callable接口的实现类对象。
        MyCallable myCallable = new MyCallable();
        FutureTask task = new FutureTask<>(myCallable);
        Thread thread = new Thread(task);
        thread.start();
        System.out.println(task.get()); //阻塞,main线程若抢到cpu使用权但仍然会等新线程执行完毕
        for (int i = 0; i < 10; i++) {
            System.out.println("main线程:"+i);
        }
    }
}

class MyCallable implements Callable<String> {

    @Override
    public String call() throws Exception {
        for (int i = 0; i < 10; i++) {
            System.out.println("新线程:"+i);
        }
        return "新线程执行完毕";
    }
}
