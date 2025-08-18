package com.itheima.demo2map;


import java.util.HashMap;
import java.util.Map;

public class d2_MapDemo2 {
    public static void main(String[] args) {
        // 目标：掌握Map的常用方法。
        Map<String,Integer> map = new HashMap<>();
        map.put("嫦娥", 20);
        map.put("女儿国王", 31);
        map.put("嫦娥", 28);
        map.put("铁扇公主", 38);
        map.put("紫霞", 31);
        map.put(null, null);

        // public V put(K key,V value)	添加元素
        // public int size()	获取集合的大小
        // public void clear()	清空集合
        // public boolean isEmpty()	判断集合是否为空，为空返回true , 反之
        // public V get(Object key)	根据键获取对应值
        // public V remove(Object key)	根据键删除整个元素
        // public  boolean containsKey(Object key)	判断是否包含某个键
        // public Set<K> keySet()	获取全部键的集合
    }
}
