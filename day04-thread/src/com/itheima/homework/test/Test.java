package com.itheima.homework.test;

public class Test {
    public static void main(String[] args) {
        Thread t1 = new Thread(new Task(),"小李");
        Thread t2 = new Thread(new Task(),"小王");
        t1.start();
        t2.start();
    }
}

class Task implements Runnable {
    static int money = 1000;
    @Override
    public void run() {
        for (int i=1;i<=10;i++){
            synchronized (Test.class){
                money += 100;
                System.out.println(Thread.currentThread().getName()+"存入100元后,账户余额为:"+money);
            }
        }
    }
}
