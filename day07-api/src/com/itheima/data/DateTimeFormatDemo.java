package com.itheima.data;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateTimeFormatDemo {
    public static void main(String[] args) {
        //日期格式化
        LocalDateTime localDateTime = LocalDateTime.now();
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy年MM月dd日");
        String formatTime = dateTimeFormatter.format(localDateTime);
        System.out.println(formatTime);
        //日期解析
        String time = "2025-8-15 00:00:00";
        LocalDateTime parse = LocalDateTime.parse(time, DateTimeFormatter.ofPattern("yyyy-M-dd HH:mm:ss"));
        System.out.println(parse);
    }
}
