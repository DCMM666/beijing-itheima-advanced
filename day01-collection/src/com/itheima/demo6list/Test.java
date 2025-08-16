package com.itheima.demo6list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Test {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list,"a","b","c");
        Object[] array = list.toArray();
        System.out.println(Arrays.toString(array));

        String[] array1 = list.toArray(new String[]{});
        System.out.println(Arrays.toString(array1));

    }
}
