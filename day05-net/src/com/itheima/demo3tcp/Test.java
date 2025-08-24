package com.itheima.demo3tcp;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        //冒泡排序
        int[] arr = {3,6,10,8,9, 5, 7, 6, 4, 5, 2, 3, 1};
        int temp = 0;
        int len = arr.length;
        for (int i = 0; i < len-1; i++) {

                if (arr[i+1] > arr[i]) {
                    temp = arr[i] ;
                    arr[i] = arr[i+1];
                    arr[i+1] = temp;
                }

        }
        System.out.println(Arrays.toString(arr));
    }
}
