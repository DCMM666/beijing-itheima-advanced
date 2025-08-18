package com.itheima.demo2map;


import java.util.*;

public class d1_MapDemo1 {
    public static void main(String[] args) {
        // 目标：认识Map集合的体系特点。
        // 1、创建Map集合
        // Map特点/HashMap特点：无序，键唯一，无索引
        // LinkedMap特点：有序，键唯一，无索引
        // TreeMap: 按照键可排序，键唯一，无索引


        Map<String,Integer> map = new HashMap<>();
        map.put("aaa",18);
        map.put("ccc",19);
        map.put("ddd",18);
        map.put("fff",18);
        map.put("bbb",18);
        System.out.println(map);
        Set<String> keys = map.keySet();
        for (String key : keys) {
            Integer value = map.get(key);
            System.out.println(key+"-----"+value);
        }


/*       0 LinkedHashMap<String,Integer> map = new LinkedHashMap<>();
        map.put("aaa",18);
        map.put("ccc",19);
        map.put("ddd",18);
        map.put("fff",18);
        map.put("bbb",18);
        System.out.println(map);*/

/*
        TreeMap<String,Integer> map = new TreeMap<>();
        map.put("aaa",18);
        map.put("ccc",19);
        map.put("ddd",18);
        map.put("fff",18);
        map.put("bbb",18);
        System.out.println(map);*/

/*
        System.out.println(map.size());
        Map<String,Integer> map = new HashMap<>();
        map.put("柳岩",18);
        map.put("钟晨瑶",19);
        map.put("杨幂",18);
        map.put("张杰",18);
        map.put("柳岩",18);
        System.out.println(map);
        System.out.println(map.size());
        //map.clear();
        //System.out.println(map.isEmpty());
        Integer value = map.get("钟晨瑶");
        map.remove("张杰");
        System.out.println(map.containsValue("18"));
        System.out.println(map.containsKey("张杰"));
        Set<String> values = map.keySet();
        System.out.println(values);
        System.out.println(map);*/

    }
}
