package com.itheima.demo3tcp;

import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.util.Scanner;

public class ClientDemo1 {
    public static void main(String[] args) throws Exception {
        // 目标：实现TCP通信下一发一收：客户端开发。
        Socket socket = new Socket("127.0.0.1",6666);
        BufferedWriter bf = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("请输入要发送的文字,以#结尾");
            String str = sc.next();
            if (str.equals("end")){
                bf.close();
                socket.close();
                System.out.println("退出成功!");
                return;
            }
            bf.write(str);
            bf.newLine();
            bf.flush();

        }


    }
}
