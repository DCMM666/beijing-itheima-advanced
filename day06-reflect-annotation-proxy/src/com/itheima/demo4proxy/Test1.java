package com.itheima.demo4proxy;

/*
    代理模式
        1. 静态代理 : 不改变原有的代码,对其功能增强
        2. 动态代理 : 自己不写 , 框架用

    必须存在三个角色
        1. 被代理角色
        2. 代理角色
        3. 抽象角色(接口)
 */
public class Test1 {
    public static void main(String[] args) {
        LiuYan liuYan = new LiuYan();
        assistant assistant = new assistant(liuYan);
        assistant.liveShow(1000);
        assistant.sleep();

    }
}
//抽象角色
interface star{
    void liveShow(double money);
    void sleep();
}
//被代理对象
class LiuYan implements star{

    @Override
    public void liveShow(double money) {
        System.out.println("柳岩参加真人秀赚取"+money * 0.7);
    }

    @Override
    public void sleep() {
        System.out.println("柳岩睡觉!");
    }
}
//代理角色
class assistant implements star{
    private LiuYan liuYan;

    public assistant(LiuYan liuYan) {
        this.liuYan = liuYan;
    }

    @Override
    public void liveShow(double money) {
        System.out.println("助理帮柳岩报名了一个节目!");
        liuYan.liveShow(money);
        System.out.println("活动结束");
    }

    @Override
    public void sleep() {
        System.out.println("助理给柳岩订了一个五星级大酒店");
        liuYan.sleep();
    }
}