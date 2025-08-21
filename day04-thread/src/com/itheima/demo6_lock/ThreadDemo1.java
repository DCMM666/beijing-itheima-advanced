package com.itheima.demo6_lock;

import com.itheima.demo3threadsafe.Account;

public class ThreadDemo1 {
    public static void main(String[] args) {
        // 目标：模拟线程安全问题。
        AccountRunnable accountRunnable = new AccountRunnable();
        Thread thread1 = new Thread(accountRunnable,"小明");
        Thread thread2 = new Thread(accountRunnable,"小红");
        thread1.start();
        thread2.start();
    }
}
class AccountRunnable implements Runnable{
    com.itheima.demo3threadsafe.Account account = new Account("1688",10000);
    @Override
    public void run() {
        account.drawMoney(10000);
    }
}