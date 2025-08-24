package com.itheima.demo2reflect;


import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

/*
    Class方法
        public Field[] getFields()	获取类的全部成员变量（只能获取public修饰的）
        public Field[] getDeclaredFields()	获取类的全部成员变量（只要存在就能拿到）
        public Field getField(String name)	获取类的某个成员变量（只能获取public修饰的）
        public Field getDeclaredField(String name)	获取类的某个成员变量（只要存在就能拿到）
 */
public class ReflectDemo3 {
    public static void main(String[] args) throws NoSuchFieldException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Class<Teacher> teacherClass = Teacher.class;
        Constructor<Teacher> declaredConstructor = teacherClass.getDeclaredConstructor();
        Teacher teacher = declaredConstructor.newInstance();
        Field field = teacherClass.getField("name");
        field.set(teacher,"杨");
        System.out.println(teacher);
        System.out.println("--------------");
        Field declaredField = teacherClass.getDeclaredField("hobby");
        declaredField.setAccessible(true);
        declaredField.set(teacher,"java");
        System.out.println(teacher);

    }

    private static void method() throws NoSuchFieldException {
        Class<Teacher> teacherClass = Teacher.class;
        Field[] fields = teacherClass.getFields();
        for (Field field : fields) {
            System.out.println(field);
        }
        System.out.println("--------------");
        Field[] declaredFields = teacherClass.getDeclaredFields();
        for (Field declaredField : declaredFields) {
            System.out.println(declaredField);
        }
        System.out.println("--------------");
        Field name = teacherClass.getField("name");
        System.out.println(name);
        System.out.println("--------------");
        Field age = teacherClass.getDeclaredField("age");
        System.out.println(age);
    }

}
