package com.itheima.demo2threadapi;

// 目标：搞清楚线程的常用方法。
public class ThreadApiDemo1 {
    public static void main(String[] args) throws InterruptedException {
        //线程的任务方法
        //public void run()
        MyThread mt = new MyThread();
        //mt.run();

        //启动线程的方法
        //public synchronized void start()
        mt.start();
        //获取当前线程的名称，默认名称规则是：Thread-索引
        //public final String getName()
        System.out.println(mt.getName());
        //修改线程的名称
        //public final synchronized void setName(String name)
        mt.setName("线程1");
        System.out.println(mt.getName());
        //获取当前正在执行的线程对象
        //public static native Thread currentThread()
        Thread thread = mt.currentThread();
        System.out.println(thread.getName());
        //让当前正在执行的线程休眠指定的毫秒后，再继续执行
        //public static native void sleep(long millis)
        mt.sleep(50);
        System.out.println(mt.getName());
        //   public Thread(String name)
        //   在创建线程的时候指定线程的名字
        MyThread mt2 = new MyThread("线程2");
        System.out.println(mt2.getName());
        //   public Thread(Runnable target)
        //   将Runnable对象封装为线程对象
        Thread thread1 = new Thread(( )->{
            System.out.println("线程三执行了");
        },"线程3");
        thread1.start();
        System.out.println(thread1.getName());
        //   public Thread(Runnable target, String name)
        //   将Runnable对象封装为线程对象，并指定线程的名称
    }

}
class MyThread extends Thread{
    public MyThread() {
    }

    public MyThread(String name) {
        super(name);
    }

    @Override
    public void run() {
        for (int i = 0; i < 50; i++) {
            System.out.println(i);
        }
    }
}
