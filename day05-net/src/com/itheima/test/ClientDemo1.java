package com.itheima.test;

import java.io.*;
import java.net.Socket;
import java.util.Scanner;

public class ClientDemo1 {
    public static void main(String[] args) throws Exception {
        // 目标：实现TCP通信下一发一收：客户端开发。

        Scanner sc = new Scanner(System.in);
        System.out.println("请输入发送的文件路径:");
        String path = sc.next();
        System.out.println("请输入发送的IP地址:");
        String ipPath = sc.next();
        Socket socket = new Socket(ipPath, 6666);
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream(path));
        //Socket socket = new Socket("192.168.17.220",10010);
        BufferedOutputStream bos = new BufferedOutputStream(socket.getOutputStream());
        byte[] bytes = new byte[1024 * 64];
        int len;
        while ((len = bis.read(bytes)) != -1) {
            bos.write(bytes, 0, len);
            bos.flush();
        }
        socket.shutdownOutput();
        BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        String str = br.readLine();
        System.out.println(str);


        br.close();
        bos.close();
        bis.close();
        socket.close();
    }


}
