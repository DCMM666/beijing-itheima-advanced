package com.itheima.demo3tcp;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerDemo2 {
    public static void main(String[] args) throws Exception {
        // 目标：实现TCP通信下一发一收：服务端开发。
        ServerSocket ss = new ServerSocket(6666);
        Socket accept = ss.accept();
        while (true) {
            BufferedReader br = new BufferedReader(new InputStreamReader(accept.getInputStream()));
            String str = br.readLine();
            if (str.equals("End")){
                accept.close();
                br.close();
                ss.close();
            }
            System.out.println(str);
        }
    }
}
