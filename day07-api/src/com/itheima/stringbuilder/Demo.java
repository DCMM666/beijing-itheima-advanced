package com.itheima.stringbuilder;

public class Demo {
    public static void main(String[] args) {
        //空参
        StringBuilder sb1 = new StringBuilder();
        //有参
        StringBuilder sb2 = new StringBuilder("1234567890abcde");
        //append添加
        sb1.append("12");
        sb1.append("34");
        sb1.append("56");
        sb1.append("78");
        sb1.append("90");
        System.out.println(sb1);
        System.out.println(sb2);
        //反转stringBuilder对象
        sb2.reverse();
        System.out.println("sb2 = " + sb2);
        //返回长度
        System.out.println(sb2.length());
        //将stringBuilder对象转化为字符串
        System.out.println(sb2.toString().toUpperCase());
    }
}
