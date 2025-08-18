package com.itheima.homework;

import java.util.*;

public class Test3 {
    public static void main(String[] args) {
        HashMap<Product, Integer> storeMap = new HashMap<>();
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("请输入要添加的店铺名称:");
            String storeName = sc.next();
            if(storeName.equals("end")){
                queryProductInfo(storeMap);
                return;
            }
            System.out.println("请输入要添加的商品名称:");
            String productName = sc.next();
            Product product = new Product(storeName, productName);
            if (storeMap.containsKey(product)){

                storeMap.put(product,storeMap.get(product)+1);
            }else {
                storeMap.put(product,1);
            }
        }


    }
    public static void queryProductInfo(HashMap<Product, Integer> storeMap){
        Set<Map.Entry<Product, Integer>> entries = storeMap.entrySet();
        for (Map.Entry<Product, Integer> entry : entries) {
            Product key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println("店铺名称:"+key.getStore()+"\t商品名称:"+key.getName()+"\t商品销量:"+value);
            System.out.println();
        }
    }
}
