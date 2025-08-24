package com.itheima.homework.test;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Test {
    public static void main(String[] args) {
        Student stu1 = new Student("张杰",Gender.Man);
        Student stu2 = new Student("柳岩",Gender.Female);
        Student stu3 = new Student("钟晨瑶",Gender.Female);
        Student stu4 = new Student("林俊杰",Gender.Man);
        HashMap<Student, String> map = new HashMap<>();
        map.put(stu1,"001");
        map.put(stu2,"002");
        map.put(stu3,"003");
        map.put(stu4,"004");
        Set<Student> students = map.keySet();
        students.forEach((stu)->{
            String id = map.get(stu);
            String name = stu.getName();
            Enum gender = stu.getGender();
            System.out.println("序列:"+id);
            System.out.println("姓名:"+name);
            System.out.println("性别:"+gender);
        });
    }
}
