package com.itheima.demo12datastream;
/*
    DataOutputStream数据流构造方法
    public DataOutputStream(OutputStream out)	将基础的字节输出流包装成数据输出流
    成员方法写出
        public final void writeInt(int v) throws IOException	将int类型的数据写入基础的字节输出流
        public final void writeDouble(double v) throws IOException	将double类型的数据写入基础的字节输出流
        public final void writeUTF(String str) throws IOException	将字符串数据以UTF-8编码成字节写入基础的字节输出流

   ----------------------------------------------------------------------
    DataInputStream数据流构造方法
        public DataInputStream(InputStream in)	将基础的字节输入流包装成数据输入流
    成员方法读数据
        public final int readInt() throws IOException	读取字节输出流写出去的int类型的数据
        public final double readDouble() throws IOException	读取字节输出流写出去的double类型的数据
        public final String readUTF() throws IOException	读取字节输出流写出去的字符串数据
 */
public class Demo1 {
}
