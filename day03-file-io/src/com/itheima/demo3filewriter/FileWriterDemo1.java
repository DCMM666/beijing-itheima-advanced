package com.itheima.demo3filewriter;

import java.io.FileWriter;
import java.io.IOException;

/*
    构造方法
        public FileWriter(String fileName) throws IOException	创建字符输出流管道与源文件路径接通
        public FileWriter(String fileName, boolean append) throws IOException	创建字符输出流管道与源文件路径接通，可追加写入
    成员方法
        public void write(int c) throws IOException	        写一个字符
        public void write(String str) throws IOException	写一个字符串
        public void write(char cbuf[]) throws IOException	写一个字符数组
        public abstract void close() throws IOException	关闭文件字符输出流管道

        远桥之下泛莲舟，
        岱岩石上溪松流。
        万仞翠山梨亭在，
        莫问声谷空悠悠。
 */
public class FileWriterDemo1 {
    public static void main(String[] args) throws IOException {
        // 目标：搞清楚文件字符输出流的使用：写字符出去的流。
        FileWriter fileWriter = new FileWriter("day03-file-io/a.txt",true);
        fileWriter.write('A');
        fileWriter.write('B');
        fileWriter.write('C');
        fileWriter.write(48);
        fileWriter.write(49);
        fileWriter.flush();
        char[] ch = {'H','E','L','L','O'};
        fileWriter.write(ch);
        fileWriter.write(ch,1,3);
        fileWriter.flush();
        fileWriter.write("\n远桥之下泛莲舟，\n");
        fileWriter.write("岱岩石上溪松流。\n");
        fileWriter.write("万仞翠山梨亭在，\n");
        fileWriter.write("莫问声谷空悠悠。\n");
        fileWriter.write("WORLD",2,2);
        fileWriter.flush();
        fileWriter.close();
    }
}
