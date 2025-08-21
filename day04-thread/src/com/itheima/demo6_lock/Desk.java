package com.itheima.demo6_lock;

public class Desk {
    //定义桌子状态
    public static int deskFlag = 0;
    //定义消费者能吃的数量
    public static int count = 10;
    public static Object lock = new Object();
}
