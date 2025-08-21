package com.itheima.demo2charset;

import java.util.Arrays;

/*
    String 类
        Java的编码方案
            public byte[] getBytes()	使用平台的默认字符集将该String编码为字节数组
            public byte[] getBytes(String charsetName)	使用指定的字符集将该String编码为字节数组
        Java的解码方案
            public String(byte[] bytes)	使用平台的默认字符集解码字节数组来构造新的String
            public String(byte[] bytes, String charsetName)	使用指定的字符集解码指定的字节数组来构造新的String
 */
public class CharSetDemo1 {
    public static void main(String[] args) throws Exception {
        // 目标：写程序实现字符编码和解码
        String str = "你好,world";
        // 1、编码
        //public byte[] getBytes()	使用平台的默认字符集将该String编码为字节数组
        byte[] bytes = str.getBytes();
        System.out.println(Arrays.toString(bytes));
        //public byte[] getBytes(String charsetName)	使用指定的字符集将该String编码为字节数组
        byte[] bytes1 = str.getBytes("gbk");
        System.out.println(Arrays.toString(bytes1));


        // 2、解码
        //  public String(byte[] bytes)	使用平台的默认字符集解码字节数组来构造新的String
        //  public String(byte[] bytes, String charsetName)	使用指定的字符集解码指定的字节数组来构造新的String
        String s = new String(bytes);
        System.out.println(s);
        String s1 = new String(bytes1,"GBK");
        System.out.println(s1);
    }
}
