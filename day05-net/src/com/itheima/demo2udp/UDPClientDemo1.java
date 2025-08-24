package com.itheima.demo2udp;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Scanner;

public class UDPClientDemo1 {
    public static void main(String[] args) throws Exception {
        // 目标：完成UDP通信一发一收：客户端开发
        DatagramSocket datagramSocket = new DatagramSocket();
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("请输入要发送的内容:");
            String str = sc.next();
            if(str.equals("End")){
                datagramSocket.close();
                System.out.println("退出");
                return;
            }
            byte[] bytes = str.getBytes();
            InetAddress target = InetAddress.getByName("192.168.17.220");
            DatagramPacket datagramPacket = new DatagramPacket(bytes,bytes.length,target,10010);
            datagramSocket.send(datagramPacket);
        }


    }
}
