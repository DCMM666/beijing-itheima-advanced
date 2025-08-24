package com.itheima.demo2reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/*
    方法
        Method[] getMethods()	获取类的全部成员方法（只能获取public修饰的）
        Method[] getDeclaredMethods()	获取类的全部成员方法（只要存在就能拿到）
        Method getMethod(String name, Class<?>... parameterTypes) 	获取类的某个成员方法（只能获取public修饰的）
        Method getDeclaredMethod(String name, Class<?>... parameterTypes)	获取类的某个成员方法（只要存在就能拿到）
 */
public class ReflectDemo4 {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Class<Teacher> teacherClass = Teacher.class;
        Constructor<Teacher> declaredConstructor = teacherClass.getDeclaredConstructor();
        Teacher teacher = declaredConstructor.newInstance();
        Method[] methods = teacherClass.getMethods();
        for (Method method : methods) {
            System.out.println(method);
        }
        System.out.println("-----------");
        Method setPhone = teacherClass.getDeclaredMethod("setPhone", String.class);
        setPhone.setAccessible(true);
        setPhone.invoke(teacher,"123456");
        System.out.println(teacher);
        System.out.println("-----------");
        Method getPhone = teacherClass.getDeclaredMethod("getPhone");
        //getPhone.setAccessible(true);
        Object invoke = getPhone.invoke(teacher);
        System.out.println(invoke);

    }
}
