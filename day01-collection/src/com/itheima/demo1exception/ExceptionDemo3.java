package com.itheima.demo1exception;

import java.util.Scanner;

/*
    目标：认识异常的体系，搞清楚异常的基本作用。

    异常捕获基本使用
 */
public class ExceptionDemo3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("请输入您的年龄:");
            int inputAge = sc.nextInt();
            try {
                runtimeCheckAge(inputAge);
                break;
            } catch (Exception e) {
                e.printStackTrace();
                System.out.println("您输入的年龄错误");
            }

        }

    }

   //使用自定义运行异常
    public static void runtimeCheckAge(int age) {
        if (age >= 0 && age <= 150) {
            System.out.println("age = " + age);
        } else {
            throw new AgeOutOfBoundsRuntimeException("年龄超出范围");
        }

    }

    // 定义一个方法捕获编译异常。
    public static void exceptionCheckAge(int age) throws AgeOutOfBoundsException {
        if (age >= 0 && age <= 150) {
            System.out.println("age = " + age);
        } else {
            throw new AgeOutOfBoundsException("年龄编译异常");
        }

    }

}
