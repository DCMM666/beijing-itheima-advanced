package com.itheima.demo2map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class d4_MapTraverseDemo4 {
    public static void main(String[] args) {
        // 目标：掌握Map集合的遍历方式二：键值对。
        Map<String, Integer> map = new HashMap<>();
        map.put("嫦娥", 20);
        map.put("女儿国王", 31);
        map.put("嫦娥", 28);
        map.put("铁扇公主", 38);
        map.put("紫霞", 31);
        System.out.println("------------");
        //第一种遍历
        Set<String> keys = map.keySet();
        for (String key : keys) {
            Integer value = map.get(key);
            System.out.println(key + "-----" + value);
        }
        System.out.println("-----------");
        //第二种遍历
        Set<Map.Entry<String, Integer>> set = map.entrySet();
        for (Map.Entry<String, Integer> entry : set) {
            String key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println(key + "----" + value);
        }
        System.out.println("-------------");
        //第三种遍历
        map.forEach((key, value) -> {
            System.out.println(key + "----" + value);
        });
    }
}
