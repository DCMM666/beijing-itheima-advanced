package com.itheima.demo6fileinputStream;

/*
    FileInputStream构造方法
        public FileInputStream(String name) throws FileNotFoundException	创建字节输入流管道与源文件路径接通
        public FileInputStream(File name) throws FileNotFoundException	创建字节输入流管道与源文件对象接通
    成员方法
        public int read() throws IOException	每次读取一个字节返回，如果没有数据可读会返回-1.
        public int read(byte b[]) throws IOException	每次用一个字节数组去读取数据，返回字节数组读取了多少个字节，如果没有数据可读会返回-1.
        public void close() throws IOException	关闭文件字节输入流管道
 */

import java.io.FileInputStream;

public class FileInputStreamDemo1 {
    public static void main(String[] args) throws Exception {
        // 目标：掌握文件字节输入流读取文件中的字节数组到内存中来。
        FileInputStream fis = new FileInputStream("");
    }
}
