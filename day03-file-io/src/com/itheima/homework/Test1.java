package com.itheima.homework;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

public class Test1 {
    public static void main(String[] args) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter("day03-file-io/src/com/itheima/homework/test1.txt"));
             BufferedReader br = new BufferedReader(new FileReader("day03-file-io/src/com/itheima/homework/test1.txt"))
        ) {
            bw.write("33 22 11 55 44");
            bw.flush();
            String str = br.readLine();
            String[] split = str.split(" ");
            ArrayList<Integer> list = new ArrayList<>();
            for (int i = 0; i < split.length; i++) {
                list.add(Integer.parseInt(split[i]));
            }
            Collections.sort(list);
            System.out.println(list);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
