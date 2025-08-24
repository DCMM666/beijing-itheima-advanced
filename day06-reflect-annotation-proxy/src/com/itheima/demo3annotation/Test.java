package com.itheima.demo3annotation;



public class Test {

    private String name;
    private int age;

    public Test() {
    }

    public Test(String name, int age) {
        this.name = name;
        this.age = age;
    }
    @check(fieldName = "获取名字")
    public String getName() {
        return name;
    }
    @check(fieldName = "设置名字")
    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
