package com.itheima.demo1hashset;

import java.util.HashSet;
import java.util.Iterator;
/*
    结论 : HashSet 集合 , 要想保证元素唯一
        那么元素所在的类必须重写 hashCode 和 equals 方法!
 */
public class SetDemo2 {
    public static void main(String[] args) {
/*        // 目标：掌握HashSet集合去重操作。
        HashSet<Student> hs = new HashSet<>();

        // 添加元素
        hs.add(new Student("柳岩" , 18));
        hs.add(new Student("柳岩" , 18));
        hs.add(new Student("李沁" , 20));
        hs.add(new Student("杨幂" , 19));

        // 遍历
        Iterator<Student> it = hs.iterator();
        while(it.hasNext()){
            Student s = it.next();
            System.out.println(s);
        }*/

        HashSet<User> users = new HashSet<>();
        users.add(new User("杨幂",18));
        users.add(new User("钟晨瑶",18));
        users.add(new User("张杰",21));
        users.add(new User("林俊杰",23));
        users.add(new User("杨幂",18));

        Iterator<User> its = users.iterator();
        while(its.hasNext()){
            User s = its.next();
            System.out.println(s);
        }

    }
}
