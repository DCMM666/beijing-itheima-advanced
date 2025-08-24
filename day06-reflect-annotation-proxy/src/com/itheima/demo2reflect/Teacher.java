package com.itheima.demo2reflect;


public class Teacher {
    public String name;
    private int age;
    private String hobby;
    private double salary;
    private String className;
    private char sex;
    private String phone;

    public Teacher() {
    }

    public Teacher(String name, int age, String hobby, double salary, String className, char sex, String phone) {
        this.name = name;
        this.age = age;
        this.hobby = hobby;
        this.salary = salary;
        this.className = className;
        this.sex = sex;
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getHobby() {
        return hobby;
    }

    public void setHobby(String hobby) {
        this.hobby = hobby;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    protected String getPhone() {
        return phone;
    }

    private void setPhone(String phone) {

        this.phone = phone;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", hobby='" + hobby + '\'' +
                ", salary=" + salary +
                ", className='" + className + '\'' +
                ", sex=" + sex +
                ", phone='" + phone + '\'' +
                '}';
    }
}
