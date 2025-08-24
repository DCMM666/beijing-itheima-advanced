package com.itheima.demo2reflect;


import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Field;

// 自定义框架
public class SaveObjectFrameWork {
    // 保存任意对象的静态方法
    public static void saveObject(Object obj) throws IOException, IllegalAccessException {
        //获取字节码对象
        Class<?> aClass = obj.getClass();
        //创建高效的字符输入流
        BufferedWriter bw = new BufferedWriter(new FileWriter("day06-reflect-annotation-proxy/obj.txt",true));
        //获取字节对象对应的简易类名
        String simpleName = aClass.getSimpleName();
        bw.write("-----------"+simpleName+"-----------");
        bw.newLine();
        bw.flush();
        //获取到所有的成员变量
        Field[] declaredFields = aClass.getDeclaredFields();
        //遍历每一个成员变量
        for (Field declaredField : declaredFields) {
            //暴力反射
            declaredField.setAccessible(true);
            //获取成员变量名
            String fieldName = declaredField.getName();
            //获取成员变量的值
            Object fieldValue = declaredField.get(obj);
            //将成员变量名和值写入
            bw.write(fieldName+":"+fieldValue);
            bw.newLine();
            bw.flush();
        }
        bw.close();

    }
}
