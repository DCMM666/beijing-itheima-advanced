package com.itheima.demo2udp;

import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class UDPServerDemo2 {
    public static void main(String[] args) throws Exception {
        // 目标：完成UDP通信一发一收：服务端开发。
        DatagramSocket datagramSocket = new DatagramSocket(6666);
        byte[] bytes = new byte[1024 * 64];
        DatagramPacket datagramPacket = new DatagramPacket(bytes, bytes.length);
        while (true) {
            datagramSocket.receive(datagramPacket);
            int length = datagramPacket.getLength();
            String string = new String(bytes, 0, length);
            if(string.equals("end")){
                System.out.println("退出成功!");
                datagramSocket.close();
                return;
            }else{
                System.out.println(string);
            }
        }
    }
}
