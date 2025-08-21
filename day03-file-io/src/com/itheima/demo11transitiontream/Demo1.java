package com.itheima.demo11transitiontream;

import java.io.*;

/*
    InputStreamReader
        public InputStreamReader(InputStream in)	使用默认字符编码将一个字节输入流流包装成字符输入流
        public InputStreamReader(InputStream in, String charsetName)	使用指定字符编码将一个字节输入流包装成字符输入流
    OutputStreamWriter
        public OutputStreamWriter(OutputStream out)	使用默认字符编码将一个字节输出流流包装成字符输出流
        public OutputStreamWriter(OutputStream out, String charsetName)	使用指定字符编码将一个字节输出流包装成字符输出流

    远桥之下泛莲舟，
    岱岩石上溪松流。
    万仞翠山梨亭在，
    莫问声谷空悠悠。
 */
public class Demo1 {
    public static void main(String[] args) throws IOException {
        OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("day03-file-io/d.txt") ,"gbk");
        osw.write("远桥之下泛莲舟，\n");
        osw.flush();
        osw.write("岱岩石上溪松流。\n");
        osw.flush();
        osw.write("万仞翠山梨亭在，\n");
        osw.flush();
        osw.write("莫问声谷空悠悠。\n");
        osw.flush();
        osw.close();
        exchange();
    }

    private static void exchange() throws IOException {
        InputStreamReader  isr = new InputStreamReader(new FileInputStream("day03-file-io/d.txt"),"gbk");
        char[] chs =new char[1024];
        int len;
        while((len= isr.read(chs))!=-1){
            System.out.println(new String(chs,0,len));
        }
        isr.close();
    }
}
