package com.itheima.demo10bufferedCharStream;
/*
    高效的字符流
        public BufferedReader(Reader in)	把原始的字符输入流包装成一个缓冲字符输入流，从而提高读数据的性能
        public BufferedWriter(Writer out)	把原始的字符输出流包装成一个缓冲字符输出流，从而提高写数据的性能

    字符缓冲输入流新增的功能：按行读
        public String readLine() throws IOException	读取一行数据并返回，如果没有数据可读了，返回null
    字符缓冲输出流新增的功能：换行
        public void newLine() throws IOException	换行
 */
public class BufferedReaderDemo1 {
    public static void main(String[] args) {
        // 目标：搞清楚缓冲字符输入流读取字符内容：性能提升了，多了按照行读取文本的能力。

    }
}
