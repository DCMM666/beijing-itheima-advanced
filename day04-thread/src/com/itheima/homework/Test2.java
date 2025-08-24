package com.itheima.homework;

public class Test2 {
    public static void main(String[] args) {
        Task2 task2 = new Task2();
        Thread thread1 = new Thread(task2, "小明");
        Thread thread2 = new Thread(task2, "小王");
        thread1.start();
        thread2.start();
    }
}

class Task2 implements Runnable {
    int count = 0;
    int endCount = 0;

    @Override
    public void run() {
        String name = Thread.currentThread().getName();
        while (true) {
            synchronized (Test2.class) {
                if (count >= 100) {
                    break;
                }
                count++;
                System.out.println(name + "抄了" + count + "次,两人还需要抄写" + (100 - count) + "次");
                if (name.equals("小明")) {
                    endCount++;
                }
            }
        }
        if (name.equals("小明")) {
            System.out.println("小明抄了" + endCount + "次");
            System.out.println("小王抄了" + (100 - endCount) + "次");
        }
    }
}
