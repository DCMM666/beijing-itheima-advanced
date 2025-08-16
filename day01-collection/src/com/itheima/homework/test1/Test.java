package com.itheima.homework.test1;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();
        Student stu1 = new Student(1, "小亮", 99);
        Student stu2 = new Student(2, "小强", 85);
        Student stu3 = new Student(3, "小响", 90);
        Student stu4 = new Student(4, "小勇", 75);
        list.add(stu1);
        list.add(stu2);
        list.add(stu3);
        list.add(stu4);
        int index = 0;
        double score = list.get(0).getScore();
        for (int i = 1; i < list.size(); i++) {
            Student student = list.get(i);
            double stuScore = student.getScore();
            if (stuScore < score) {
                score = stuScore;
                index = i;
            }
        }
        list.remove(index);
        for (Student student : list) {
            System.out.println("学生序列" + student.getId());
            System.out.println("学生名字" + student.getName());
            System.out.println("学生分数" + student.getScore());
            System.out.println();
        }
    }

}
