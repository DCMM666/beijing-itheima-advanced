package com.itheima.demo05proxy2;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class Test {
    public static void main(String[] args) {
        LiuYan liuYan = new LiuYan();
        Class<? extends LiuYan> liuyanClass = liuYan.getClass();
        ClassLoader classLoader = liuyanClass.getClassLoader();
        Class<?>[] interfaces = liuyanClass.getInterfaces();
        Star zhuLi = (Star) Proxy.newProxyInstance(classLoader, interfaces, new InvocationHandlerImpl(liuYan));
        zhuLi.liveShow(1000);
        zhuLi.sleep();
    }
}
class InvocationHandlerImpl implements InvocationHandler{
    private LiuYan liuYan;

    public InvocationHandlerImpl(LiuYan liuYan) {
        this.liuYan = liuYan;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        if (method.getName().equals("liveShow")){
            System.out.println("助理帮柳岩报名了一个节目!");
            method.invoke(liuYan,args[0]);
            System.out.println("活动结束");
        }else if (method.getName().equals("sleep")){
            method.invoke(liuYan);
        }
        return null;
    }
}
//抽象角色
interface Star{
    void liveShow(double money);
    void sleep();
}
//被代理对象
class LiuYan implements Star {

    @Override
    public void liveShow(double money) {
        System.out.println("柳岩参加真人秀赚取"+money * 0.7);
    }

    @Override
    public void sleep() {
        System.out.println("柳岩睡觉!");
    }
}
