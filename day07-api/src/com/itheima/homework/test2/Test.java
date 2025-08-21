package com.itheima.homework.test2;

import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class Test {
    public static void main(String[] args) {
        HashSet<Integer> hashSet = new HashSet<>();
        Random random = new Random();
        while (hashSet.size()<6) {
            int randomRed = random.nextInt(33)+1;
            hashSet.add(randomRed);
        }
        List<Integer> list = hashSet.stream().collect(Collectors.toList());
        Collections.sort(list);
        int randomBlue = random.nextInt(16)+1;
        list.add(randomBlue);
        System.out.println("中奖号码为"+list);
    }
}
