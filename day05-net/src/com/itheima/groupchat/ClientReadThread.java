package com.itheima.groupchat;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

public class ClientReadThread implements Runnable {
    private Socket socket;

    public ClientReadThread(Socket socket) {
        this.socket = socket;
    }

    @Override
    public void run() {
        while (true) {
            try {
                String hostName = socket.getInetAddress().getHostName();
                BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
                String str = br.readLine();
                System.out.println("用户"+hostName+":"+str);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
