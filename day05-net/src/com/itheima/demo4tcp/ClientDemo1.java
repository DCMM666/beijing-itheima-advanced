package com.itheima.demo4tcp;

import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.util.Scanner;

public class ClientDemo1 {
    public static void main(String[] args) throws Exception {
        // 目标：实现TCP通信下多发多收：客户端开发。
        Socket socket = new Socket("127.0.0.1",6666);
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
        Scanner sc = new Scanner(System.in);
        String message = sc.next();
        bw.write(message);
        bw.newLine();
        bw.flush();
        bw.close();
        socket.close();
    }
}
