package com.itheima.demo7executorService;


import java.sql.Time;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class ExecutorServiceDemo1 {
    public static void main(String[] args) {
        // 目标：创建线程池对象来使用。
        // 1、使用线程池的实现类ThreadPoolExecutor声明七个参数来创建线程池对象。
        ThreadPoolExecutor threadPool = new ThreadPoolExecutor(
                3,      //线程核心数量
                10,                //最大线程数量
                60,                //时间值
                TimeUnit.SECONDS,  //时间单位
                new ArrayBlockingQueue<>(20),   //工作队列
                Executors.defaultThreadFactory(),       //线程工厂
                new ThreadPoolExecutor.CallerRunsPolicy()    //任务拒绝策略
        );
        for (int i = 0; i <31; i++) {
            threadPool.submit(new Task());
        }
    }
}
class Task implements Runnable{
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()+":"+100);
    }
}
