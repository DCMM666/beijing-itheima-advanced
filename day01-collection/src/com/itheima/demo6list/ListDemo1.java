package com.itheima.demo6list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ListDemo1 {
    public static void main(String[] args) {
        // 目标：掌握List系列集合独有的功能。
        ArrayList<String> names = new ArrayList<>();
        Collections.addAll(names,"java入门","枸杞子","宁夏枸杞","人字拖");
        System.out.println("-----------四种遍历演示---------------");

        // 1、for循环
        for (int i = 0; i < names.size(); i++) {
            System.out.println(names.get(i));
        }

        // 2、迭代器
        Iterator<String> it = names.iterator();
        while(it.hasNext()){

        }

        // 3、增强for


        // 4、lambda表达式
    }
}
