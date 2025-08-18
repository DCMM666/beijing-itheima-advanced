package com.itheima.demo1hashset;

import java.util.TreeSet;

// 目标：搞清楚TreeSet集合对于自定义对象的排序
public class SetDemo3 {
    public static void main(String[] args) {
        //自然排序和比较器排序都存在的情况下优先使用比较器
        TreeSet<Student> students = new TreeSet<>((o1, o2) -> {
            int result = o2.getAge() - o1.getAge();
            return result == 0 ? o2.getName().compareTo(o1.getName()) : result;
        });
        students.add(new Student("liu", 18));
        students.add(new Student("guo", 18));
        students.add(new Student("bai", 18));
        students.add(new Student("men", 19));

        System.out.println(students);
    }
}
