package com.itheima.demo1exception;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

//可变参数格式 数据类型... elements
public class genericType {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        addElement(list,"1","2","3");
        System.out.println(list);
        ArrayList<Integer> list1 = new ArrayList<>();
        addElement(list1,1,2,3,4,5);
        System.out.println(list1);
        Collection<Integer> list2 = new ArrayList<>();
        Collections.addAll(list2,1,2,3,4,5,6,7,8);
        System.out.println(list2);
    }
    public static <E> void addElement(ArrayList<E> list,E... e){
        for (E element:e){
            list.add(element);
        }
    }
}
