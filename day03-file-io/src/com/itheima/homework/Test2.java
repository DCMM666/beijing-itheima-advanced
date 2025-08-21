package com.itheima.homework;

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Test2 {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter("day03-file-io/src/com/itheima/homework/test2.txt"));
        bw.write("asdfghjasdfagsdasdfgadfagd");
        bw.flush();
        bw.close();
        BufferedReader br = new BufferedReader(new FileReader("day03-file-io/src/com/itheima/homework/test2.txt"));
        int ch;
        HashMap<Character, Integer> map = new HashMap();
        while ((ch = br.read()) != -1) {
            char c = (char) ch;
            if (map.containsKey(c)) {
                map.put(c, map.get(c) + 1);
            } else {
                map.put(c, 1);
            }
        }
        map.forEach((key,value)->{
            System.out.println(key + "=" + value);
        });

//        Set<Map.Entry<Character, Integer>> entries = map.entrySet();
//        for (Map.Entry<Character, Integer> entry : entries) {
//            Character key = entry.getKey();
//            Integer value = entry.getValue();
//
//        }
        br.close();
    }
}
