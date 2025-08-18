package com.itheima.demo3stream;

import java.util.*;
import java.util.stream.Collectors;

public class StreamDemo4 {
    public static void main(String[] args) {
        // 目标：掌握Stream流的统计，收集操作（终结方法）
        List<String> list = new ArrayList<>();
        list.add("a张无忌");
        list.add("c周芷若");
        list.add("d赵敏");
        list.add("d赵敏");
        list.add("d赵敏");
        list.add("f张强");
        list.add("b张三丰");
        list.add("e张翠山");
        //收集到数组
        String[] array = list.stream().toArray((i) -> new String[i]);
        System.out.println(Arrays.toString(array));
        //收集到list
        List<String> newlist = list.stream().filter((s) -> s.length() == 4).collect(Collectors.toList());
        System.out.println(newlist);
        //收集到set
        Set<String> set = list.stream().collect(Collectors.toSet());
        System.out.println(set);
        //收集到map
        List<String> list2 = new ArrayList<>();
        Collections.addAll(list2, "aaa,1", "bbb,2", "ccc,3");
        Map<String, String> map = list2.stream().collect(Collectors.toMap((String s) -> {
                    String[] strArr = s.split(",");
                    return strArr[0];
                },
                (String s) -> {
                    String[] strArr = s.split(",");
                    return strArr[1];
                }));
        System.out.println(map);
    }

}

