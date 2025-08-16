package com.itheima.demo1exception;

/*
    目标：认识异常的体系，搞清楚异常的基本作用。

    抛出异常基本使用
 */
public class ExceptionDemo2 {
    public static void main(String[] args) {
        show1(10, 2);
        show2(10, 0);
    }

    // 定义一个方法抛出编译异常。
    public static void show1(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("除数不能为0");
        } else {
            System.out.println(a / b);
        }
    }

    // 定义一个方法抛出运行时异常。
    public static void show2(int a, int b) {
        try {
            System.out.println(a / b);
        } catch (ArithmeticException e) {
            //System.out.println("除数不能为0");
            e.printStackTrace();
        }
        System.out.println("代码执行完毕");

    }
}
