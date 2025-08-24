package com.itheima.demo2reflect;


import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/*
    获取类的构造器对象
 */
public class ReflectDemo2 {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Class<Student> studentClass = Student.class;
        Constructor<Student> constructor = studentClass.getConstructor();
        Student student1 = constructor.newInstance();
        System.out.println(student1);
        System.out.println("-------------");
        Constructor<Student> declaredConstructor = studentClass.getDeclaredConstructor(String.class, int.class, String.class);
        //私有的构造方法需要暴力反射才能创建对象
        declaredConstructor.setAccessible(true);//setAccessible(true)暴力反射,禁止检查访问控制
        Student student = declaredConstructor.newInstance("钟晨瑶", 18, "演戏");
        System.out.println(student);
    }

    private static void mothed() throws NoSuchMethodException {
        Class<Student> studentClass = Student.class;
        //getConstructors()获取所有public修饰的构造
        Constructor<?>[] constructors = studentClass.getConstructors();
        for (Constructor<?> constructor : constructors) {
            System.out.println(constructor);
        }
        System.out.println("----------------");
        //getDeclaredConstructors()获取全部构造
        Constructor<?>[] declaredConstructors = studentClass.getDeclaredConstructors();
        for (Constructor<?> declaredConstructor : declaredConstructors) {
            System.out.println(declaredConstructor);
        }
        System.out.println("----------------");
        //getConstructor(对象参数)获取一个public修饰的构造
        Constructor<Student> constructor = studentClass.getConstructor();
        System.out.println(constructor);
        System.out.println("----------------");
        //getDeclaredConstructor(对象参数)获取一个任意权限的构造
        Constructor<Student> declaredConstructor = studentClass.getDeclaredConstructor(String.class, int.class, String.class);
        System.out.println(declaredConstructor);
    }

}
