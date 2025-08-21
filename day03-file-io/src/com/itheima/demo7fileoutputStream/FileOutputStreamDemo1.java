package com.itheima.demo7fileoutputStream;

import java.io.FileInputStream;
import java.io.FileOutputStream;

/*
    FileOutputStream构造方法
        public FileOutputStream(String name) throws FileNotFoundException	创建字节输出流管道与源文件路径接通
        public FileOutputStream(String name, boolean append)    throws FileNotFoundException	创建字节输出流管道与源文件路径接通，可追加写入
    成员方法
        public void write(int b) throws IOException	写一个字节
        public void write(byte b[]) throws IOException 	写一个字节数组
        public void write(byte b[], int off, int len) throws IOException	写一个字节数组的一部分
        public abstract void close() throws IOException	关闭文件字节输出流管道
 */
public class FileOutputStreamDemo1 {
    public static void main(String[] args) throws Exception {
        // 目标：学会使用文件字节输出流。
        FileOutputStream fos = new FileOutputStream("day03-file-io/c.txt",true);
        fos.write("abs".getBytes());
        fos.close();
        FileInputStream fis = new FileInputStream("day03-file-io/c.txt");
        byte[] bys = new byte[1024];
        int len;
        while((len=fis.read(bys))!=-1){
            System.out.println(new String(bys,0,len));
        }
        fis.close();
    }
}
