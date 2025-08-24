package com.itheima.groupchat;


import java.io.*;
import java.net.Socket;

public class ServerThread implements Runnable {
    private Socket socket;

    public ServerThread(Socket socket) {
        this.socket = socket;
    }

    @Override
    public void run() {
        try {
            //读取客户端发送的信息
            BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            while (true) {
                String str = br.readLine();
                if (str == null) {
                    //当str为空时候跳出循环
                    break;
                }
                //遍历客户端socket集合,拿到每一个的socket对象
                for (Socket sk : Server.sockets) {
                    //当客户端不是本机时,为其他客户端转发消息
                    if (socket != sk) {
                        //创建高效的字符输出流,将socket的普通的字节输出流转化为高效的字符输出流
                        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(sk.getOutputStream()));
                        bw.write(str);
                        bw.newLine();
                        bw.flush();

                    }

                }
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
