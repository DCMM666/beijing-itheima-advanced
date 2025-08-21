package com.itheima.demo3threadsafe;


public class Account {
    private String cardId;
    private double money;

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
        synchronized (Account.class) {
            if (money <= this.money) {
                System.out.println(name+"提款"+money);
                this.money -= money;
                System.out.println(name+"提款后余额为:"+this.money);
            }else {
                System.out.println("余额不足!");
            }
        }

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
