package com.itheima.homework.test2;

import java.util.ArrayList;
import java.util.Collections;

public class Test {
    public static void main(String[] args) {
        Student stu1 = new Student(1, "张无忌", "河北");
        Student stu2 = new Student(2, "张三丰", "河南");
        Student stu3 = new Student(3, "赵敏", "蒙古");
        Student stu4 = new Student(4, "周芷若", "四川");
        ArrayList<Student> students = new ArrayList<>();
        Collections.addAll(students, stu1, stu2, stu3, stu4);
        int index = getIndex(students, "张三丰");
        if (index >= 0) {
            Student student = students.get(index);
            student.setAddress("山东");
        } else {
            System.out.println("学生对象不存在");
            return;
        }
        students.forEach((student) -> {
            System.out.println("学生序列:" + student.getId());
            System.out.println("学生名字:" + student.getName());
            System.out.println("学生分数:" + student.getAddress());
            System.out.println();
        });

    }

    public static int getIndex(ArrayList<Student> students, String name) {
        for (int i = 0; i < students.size(); i++) {
            Student student = students.get(i);
            if (student.getName().equals(name)) {
                return i;
            }
        }
        return -1;
    }
}
