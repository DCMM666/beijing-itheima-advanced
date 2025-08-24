package com.itheima.demo4tcp;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerDemo2 {
    public static void main(String[] args) throws Exception {
        // 目标：实现TCP通信下多发多收：服务端开发。
        ServerSocket serverSocket = new ServerSocket(6666);
        Socket socket = serverSocket.accept();
        BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        String message = br.readLine();
        System.out.println(message);
        br.close();
        socket.close();
        serverSocket.close();
    }
}
