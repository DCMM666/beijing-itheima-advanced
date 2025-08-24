package com.itheima.demo2reflect;

public class ReflectDemo1 {
    public static void main(String[] args) throws Exception {
        // 目标：掌握反射第一步操作：或者类的Class对象。（获取类本身）。
        // 获取Class对象的三种方式
        Class<Student> studentClass1 = Student.class;
        // 调用Class提供方法：public static Class forName(String package)；
        Class<?> studentClass2 = Class.forName("com.itheima.demo2reflect.Student");
        // Object类提供的方法： public Class getClass()；  Class c3 = 对象.getClass();
        Student stu = new Student();
        Class<? extends Student> studentClass3 = stu.getClass();
        // 类的字节码对象是唯一的!!!
        System.out.println(studentClass1 == studentClass2);
        System.out.println(studentClass2 == studentClass3);
        //字节码对象的常用方法
        System.out.println(studentClass1.getName());//com.itheima.demo2reflect.Student
        System.out.println(studentClass1.getSimpleName());//Student

    }
}
