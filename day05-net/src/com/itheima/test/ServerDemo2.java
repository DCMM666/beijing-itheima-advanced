package com.itheima.test;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.UUID;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class ServerDemo2 {
    public static void main(String[] args) throws Exception {
        ServerSocket serverSocket = new ServerSocket(6666);
        ThreadPoolExecutor threadPool = new ThreadPoolExecutor(
                5,
                10,
                60,
                TimeUnit.SECONDS,
                new ArrayBlockingQueue<>(20),
                Executors.defaultThreadFactory(),
                new ThreadPoolExecutor.AbortPolicy()
        );
        while (true) {
            Socket socket = serverSocket.accept();
            threadPool.submit(new Task(socket));
        }


    }
}

class Task implements Runnable {
    private Socket socket;

    public Task(Socket socket) {
        this.socket = socket;
    }

    @Override
    public void run() {
        String hostAddress = socket.getInetAddress().getHostAddress();
        try {
            System.out.println("用户:"+hostAddress+"正在发送");
            BufferedInputStream bis = new BufferedInputStream(socket.getInputStream());
            BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("day05-net/src/com/itheima/test/"+hostAddress+ UUID.randomUUID() +".jpg"));
            byte[] bytes = new byte[1024 * 64];
            int len;
            while ((len = bis.read(bytes)) != -1) {
                bos.write(bytes, 0, len);
            }
            bos.close();
            System.out.println("用户:"+hostAddress+"发送成功!");
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
            bw.write("不错!");
            bw.newLine();
            bw.flush();
        } catch (IOException e) {
            System.err.println("用户:"+hostAddress+"发生异常,异常原因:"+e.toString());
        }
    }
}

