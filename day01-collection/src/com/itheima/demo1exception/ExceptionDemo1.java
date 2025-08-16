package com.itheima.demo1exception;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/*
    目标：认识异常的体系

    异常处理方案
 */
public class ExceptionDemo1 {
    public static void main(String[] args) throws ParseException {
        //show1();
        show2();
    }
    public static void show1(){
        int[] arr = new int[3];
        System.out.println(arr[3]);
    }
    public static void show2() throws ParseException {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-mm-dd");
        Date date = simpleDateFormat.parse("2025-08-15");
        System.out.println(date);
    }
}
