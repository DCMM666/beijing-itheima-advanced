package com.itheima.demo1exception;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        ArrayList<Object> list1 = new ArrayList<>();
        ArrayList<Number> list2 = new ArrayList<>();
        ArrayList<Integer> list3 = new ArrayList<>();

        mothed1(list1);
        mothed1(list2);
        mothed1(list3);

        //mothed2(list1);   //受限泛型<? extends Number> 只能继承该数据类型与数据类型子类型
        mothed2(list2);
        mothed2(list3);

        mothed3(list1);
        mothed3(list2);
        //mothed3(list3);  //受限泛型<? super Number> 只能继承该数据类型与数据类型父类型
    }

    public static void mothed1(ArrayList<?> list) {
        //?所有的包装类型,但不可以增加和设置集合内容
        //list.add("123");
        //list.set(1,"123");
        System.out.println(list.get(1));
        System.out.println(list.remove(1));
        //可以增加和移除内容
    }

    public static void mothed2(ArrayList<? extends Number> list) {
        System.out.println(list.get(1));
        System.out.println(list.remove(1));
    }

    public static void mothed3(ArrayList<? super Number> list) {
        System.out.println(list.get(1));
        System.out.println(list.remove(1));
    }
}
