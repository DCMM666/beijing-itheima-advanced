package com.itheima.demo2map;

import java.util.*;

public class Test {
    public static void main(String[] args) {
        //定义数组
        char[] arr = new char[80];
        Random random = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (char) (random.nextInt(4)+65);
        }
        System.out.println(Arrays.toString(arr));

        HashMap<Character,Integer> map = new HashMap<>();
        for (char c : arr) {
            if(map.containsKey(c)){
                map.put(c,map.get(c)+1);
            }else {
                map.put(c,1);
            }
        }
        System.out.println(map);

        int max = map.get('A');
        char scenery = 'A';
        Set<Character> sceneries  = map.keySet();
        for (Character key : sceneries) {
            if(map.get(key)>max){
                max =map.get(key);
                scenery= key;
            }
        }
        System.out.println("景点票数最多的是"+scenery);
    }
}
