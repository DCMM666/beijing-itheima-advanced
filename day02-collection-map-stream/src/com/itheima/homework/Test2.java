package com.itheima.homework;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Test2 {
    public static void main(String[] args) {
        HashMap<String,String> classMap1 = new HashMap<>();
        HashMap<String,String> classMap2 = new HashMap<>();
        HashMap<String,HashMap<String,String>> classMaps = new HashMap<>();
        classMap1.put("001","李晨");
        classMap1.put("002","范冰冰");
        classMap2.put("001","马云");
        classMap2.put("002","马化腾");
        classMaps.put("java基础班",classMap1);
        classMaps.put("java就业班",classMap2);
        Set<Map.Entry<String, HashMap<String, String>>> entry = classMaps.entrySet();
        for (Map.Entry<String, HashMap<String, String>> classInfo : entry) {
            String key = classInfo.getKey();
            System.out.println(key);
            HashMap<String, String> value = classInfo.getValue();
            Set<Map.Entry<String, String>> entries = value.entrySet();
            for (Map.Entry<String, String> studentInfo : entries) {
                String id = studentInfo.getKey();
                String stu = studentInfo.getValue();
                System.out.println("ID:"+id+"\t姓名:"+stu);
            }
            System.out.println();
        }
    }
}
