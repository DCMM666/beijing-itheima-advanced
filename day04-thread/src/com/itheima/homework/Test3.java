package com.itheima.homework;

public class Test3 {
    public static void main(String[] args) {
        Task3 task3 = new Task3();
        new Thread(task3, "前门").start();
        new Thread(task3, "后门").start();
    }
}

class Task3 implements Runnable {
    int id = 100;
    int temp = 0;

    @Override
    public void run() {
        String name = Thread.currentThread().getName();
        while (true) {
            synchronized (Test3.class) {
                if (id <= 0) {
                    break;
                }
                System.out.println("编号为:" + id + "的员工从" + name + "入场!" + "拿到的双色求号码为:" + DoubleColorBallUtils.create());
                id--;
                if (name.equals("前门")) {
                    temp++;
                }
            }
        }
        if (name.equals("前门")) {
            System.out.println("前门入场的员工总数为:" + temp + "人");
            System.out.println("后门入场的员工总数为:" + (100 - temp) + "人");
        }
    }
}