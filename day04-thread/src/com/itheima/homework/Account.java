package com.itheima.homework;

public class Account {
    private String cardId;
    private double money;

    public Account() {
    }

    public Account(String cardId, double money) {
        this.cardId = cardId;
        this.money = money;
    }

    public synchronized void saveFunds(double money) {
        this.money += money;
        System.out.println(Thread.currentThread().getName() + "卡号为:" + cardId + "存入" + money + "元后,账户的余额是:" + this.money);
    }

    public String getCardId() {
        return cardId;
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
