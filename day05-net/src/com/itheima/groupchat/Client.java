package com.itheima.groupchat;


import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("127.0.0.1",9999);
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
        new Thread(new ClientReadThread(socket)).start();
        Scanner sc = new Scanner(System.in);
        while (true) {
            String str = sc.next();
            if(str.equals("end")){
                break;
            }
            bw.write(str);
            bw.newLine();
            bw.flush();
        }
        bw.close();
        socket.close();


    }
}
