package com.itheima.demo1file;

import java.io.File;
import java.io.IOException;

/*
    File类常用功能
        public boolean exists()	判断文件对象指向的文件或文件夹是否存在
        public boolean isFile()	判断当前文件对象指向的是否是文件
        public boolean isDirectory()	判断当前文件对象指向的是否是文件夹
        public String getName()	获取文件的名称（包含后缀）
        public long length()	获取文件的大小，返回字节个数，如果是文件夹，结果无意义
        public String getAbsolutePath()	获取文件的绝对路径
        public boolean mkdirs()	创建一级或多级文件夹
        public boolean delete() 	删除文件或空文件夹
 */
public class FileDemo2 {
    public static void main(String[] args) throws IOException {
        File file1 = new File("day03-file-io/aaa");
        //   public boolean mkdirs()	创建一级或多级文件夹
        System.out.println(file1.mkdirs());
        File file2 = new File("day03-file-io/aaa/a.txt");
        File file3 = new File("day03-file-io/aaa/ddd");
        //createNewFile()创建对应文件夹
        System.out.println(file2.createNewFile());
        //   public boolean exists()	判断文件对象指向的文件或文件夹是否存在
        System.out.println(file1.exists());
        System.out.println(file2.exists());
        //   public boolean isFile()	判断当前文件对象指向的是否是文件
        System.out.println(file2.isFile());
        //   public boolean isDirectory()	判断当前文件对象指向的是否是文件夹
        System.out.println(file1.isDirectory());
        //   public String getName()	获取文件的名称（包含后缀）
        System.out.println(file1.getName());
        //   public long length()	获取文件的大小，返回字节个数，如果是文件夹，结果无意义
        System.out.println(file2.length());
        //   public String getAbsolutePath()	获取文件的绝对路径
        System.out.println(file2.getAbsoluteFile());
        //   public boolean delete() 	删除文件或空文件夹
        System.out.println(file3.delete());
    }
}
