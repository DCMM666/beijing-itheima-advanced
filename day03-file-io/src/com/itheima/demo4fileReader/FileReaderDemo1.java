package com.itheima.demo4fileReader;

import java.io.FileReader;
import java.io.IOException;

/*
    构造方法
        public FileReader(String fileName) throws FileNotFoundException	创建字符输入流管道与源文件路径接通
        public FileReader(File file) throws FileNotFoundException	创建字符输入流管道与源文件对象接通
    成员方法
        public int read() throws IOException	每次读取一个字符返回，如果没有数据可读会返回-1.
        public int read(char[] cbuf) throws IOException	每次用一个字符数组去读取数据，返回字符数组读取了多少个字符，如果没有数据可读会返回-1.
        public void close() throws IOException	关闭文件字符输入流管道
 */
public class FileReaderDemo1 {
    public static void main(String[] args) throws IOException {
        // 目标：掌握文件字符输入流读取字符内容到程序中来。
        FileReader fr = new FileReader("day03-file-io/a.txt");
        int ch;
        while ((ch = fr.read()) != -1) {
            System.out.print((char) ch);
        }
//        char[] chs = new char[1024];
//        int len;
//        while ((len = fr.read(chs))!=-1) {
//            System.out.println(new String(chs,0,len));
//        }
        fr.close();
    }
}



