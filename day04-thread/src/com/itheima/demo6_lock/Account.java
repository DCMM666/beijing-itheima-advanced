package com.itheima.demo6_lock;

import java.util.concurrent.locks.ReentrantLock;

public class Account {
    private String cardId;
    private double money;
    private static final ReentrantLock LOCK = new ReentrantLock();

    public Account() {
    }

    public Account(String cardId, double money) {
        this.cardId = cardId;
        this.money = money;
    }

    public String getCardId() {
        return cardId;
    }

    public void drawMoney(double money) {
        String name = Thread.currentThread().getName();
        LOCK.lock();
            if (money <= this.money) {
                System.out.println(name+"提款"+money);
                this.money -= money;
                System.out.println(name+"提款后余额为:"+this.money);
            }else {
                System.out.println("余额不足!");
            }
        LOCK.unlock();
    }

    public void setCardId(String cardId) {
        this.cardId = cardId;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }
}
