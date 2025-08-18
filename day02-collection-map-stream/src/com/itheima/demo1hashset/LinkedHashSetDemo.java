package com.itheima.demo1hashset;

import java.util.LinkedHashSet;

public class LinkedHashSetDemo {
    public static void main(String[] args) {
        // 有序 , 元素唯一 , 没有索引
        LinkedHashSet<String> hs = new LinkedHashSet<>();

        hs.add("abc");
        hs.add("asd");
        hs.add("qwe");
        hs.add("abc");
        hs.add("ase");

        System.out.println(hs);
    }
}
