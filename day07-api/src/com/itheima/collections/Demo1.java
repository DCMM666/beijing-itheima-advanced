package com.itheima.collections;

import java.util.ArrayList;
import java.util.Collections;

public class Demo1 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        //给集合添加元素
        Collections.addAll(list, 55, 44, 22, 11, 66, 33);
        System.out.println("添加元素list = " + list);
        //反转集合
        Collections.reverse(list);
        System.out.println("反转集合list = " + list);
        //乱序集合
        Collections.shuffle(list);
        System.out.println("乱序集合list = " + list);
        //默认升序排列
        Collections.sort(list);
        System.out.println("默认升序排列list = " + list);
        //自定义排序
        Collections.sort(list, ((o1, o2) -> o2 - o1));
        System.out.println("自定义排序list = " + list);
    }
}
