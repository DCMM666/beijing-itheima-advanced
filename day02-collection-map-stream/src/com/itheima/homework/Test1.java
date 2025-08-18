package com.itheima.homework;

import java.util.HashMap;
import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("请输入要添加的商品名称:");
            String product = sc.next();
            if (product.equals("end")) {
                exchange(map);
                return;
            } else {
                if(map.containsKey(product)){
                    map.put(product,map.get(product)+1);
                }else {
                    map.put(product,1);
                }
            }
        }

    }
    public static void exchange(HashMap<String, Integer> map){
        map.entrySet().stream().forEach((entry)->{
            String key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println(key+"售出数量:"+value);
        });
    }
}
