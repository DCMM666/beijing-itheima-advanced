package com.itheima.homework;

public class Test1 {
    public static void main(String[] args) {
        Task task = new Task();
        Thread thread1 = new Thread(task,"小王");
        Thread thread2 = new Thread(task,"小李");
        thread1.start();
        thread2.start();
    }
}
class Task implements Runnable{
    Account account = new Account("ICBC-666",1000);
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            account.saveFunds(100);
        }
    }
}
