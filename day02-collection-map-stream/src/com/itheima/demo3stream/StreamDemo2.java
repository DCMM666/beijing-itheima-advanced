package com.itheima.demo3stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.stream.Stream;

public class StreamDemo2 {
    public static void main(String[] args) {
        // 目标：获取Stream流的方式。
        // 1、获取集合的Stream流：调用集合提供的stream()方法
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list, "张无忌", "周芷若", "赵敏", "张强");
        list.stream().forEach((String s) -> {
            System.out.println(s);
        });
        // 2、Map集合，怎么拿Stream流。
        System.out.println("--------------");
        HashMap<String, Integer> map = new HashMap<>();
        map.put("张无忌", 18);
        map.put("周芷若", 18);
        map.put("赵敏", 18);
        map.put("张强", 18);
        map.keySet().stream().forEach((String s) -> {
            System.out.println(s+"---"+map.get(s));
        });
        System.out.println("--------------");
        map.entrySet().stream().forEach((entry) -> {
            String key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println(key + "----" + value);
        });
        System.out.println("----------");
        // 3、获取数组的流。
        Integer[] arr = {1,2,3,4,5,6};
        Arrays.stream(arr).forEach((i)->{
            System.out.println(i);
        });
        System.out.println("--------------");
        // 4、同种类型的多个元素。
        Stream.of(1,2,3,4,5,6,7,8).forEach((i)->{
            System.out.println(i);
        });

    }
}
