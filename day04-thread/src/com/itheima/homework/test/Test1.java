package com.itheima.homework.test;

public class Test1 {
    public static void main(String[] args) {
        Thread t1 = new Thread(new Copy(),"小明");
        Thread t2 = new Thread(new Copy(),"小王");
        t1.start();
        t2.start();
    }
}

class Copy implements Runnable {
    static int count = 0;
    static int times = 0;

    @Override
    public void run() {
        String name = Thread.currentThread().getName();
        while (true) {
            synchronized (Test.class){
                if (count >= 100){
                    break;
                }
                count++;
                System.out.println(name+"抄写一下Hello world,两人总共还要抄写;"+(100-count)+"次");
                if(name.equals("小明")){
                    times++;
                }
            }
        }
        if (name.equals("小明")){
            System.out.println("小明抄了"+times+"次");
            System.out.println("小王抄了"+(100-times)+"次");
        }

    }
}
