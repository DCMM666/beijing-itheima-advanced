package com.itheima.system;

import java.util.Arrays;

public class Demo {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,0};
        int[] newArr = new int[10];
        System.arraycopy(arr,2,newArr,2,4);
        System.out.println(Arrays.toString(newArr));
        System.exit(0);
        System.out.println("------");
    }
}
