package com.itheima.demo5trywithresource;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/*
     JDK7前资源释放 , try-catch-finally
 */
public class Demo1 {
    public static void main(String[] args) {
        try (FileReader fr = new FileReader("day03-file-io/a.txt");
             FileWriter fw = new FileWriter("day03-file-io/b.txt")) {
            char[] chs = new char[1024];
            int len;
            while ((len = fr.read(chs)) != -1) {
                fw.write(chs, 0, len);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
