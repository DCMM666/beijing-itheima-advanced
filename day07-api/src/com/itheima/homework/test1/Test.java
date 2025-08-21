package com.itheima.homework.test1;

import java.util.ArrayList;
import java.util.Collections;

public class Test {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        Student stu1 = new Student("01", "张三", 66.6);
        Student stu2 = new Student("02", "李四", 76.6);
        Student stu3 = new Student("03", "王五", 88.6);
        Student stu4 = new Student("04", "赵六", 69.7);
        students.add(stu1);
        students.add(stu2);
        students.add(stu3);
        students.add(stu4);

        Collections.sort(students, (o1, o2) -> (int) (o1.getScore() - o2.getScore()));
        for (Student student : students) {
            System.out.println("学号:" + student.getId());
            System.out.println("姓名:" + student.getName());
            System.out.println("分数:" + student.getScore());
            System.out.println();
        }
    }
}
