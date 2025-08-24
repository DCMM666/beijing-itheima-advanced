package com.itheima.groupchat;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class Server {
    //创建集合收集客户端socket对象
    public static ArrayList<Socket> sockets = new ArrayList<>();
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(9999);
        //创建线程池
        ThreadPoolExecutor threadPool = new ThreadPoolExecutor(5,10,60, TimeUnit.SECONDS, new ArrayBlockingQueue<>(20),Executors.defaultThreadFactory(),new ThreadPoolExecutor.AbortPolicy());
        while (true) {
            Socket socket = serverSocket.accept();
            //将每一个socket对象添加到sockets集合中
            sockets.add(socket);
            //为线程池提交任务
           threadPool.submit(new ServerThread(socket));
        }

    }
}
