package com.itheima.data;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class LocalDateTimeDemo {
    public static void main(String[] args) {
        LocalDate localDate = LocalDate.now();
        System.out.println(localDate);

        System.out.println(localDate.getYear());
        LocalDate localDate1 = localDate.withYear(2077);
        System.out.println(localDate1);

        LocalDate localDate2 = localDate.plusYears(1);
        System.out.println(localDate2);

        System.out.println(localDate.isBefore(localDate2));

        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime);
        System.out.println(localDateTime.getYear());
        LocalDateTime localDateTime1 = localDateTime.withMonth(12);
        System.out.println(localDateTime1);

        LocalTime localTime = LocalTime.now();
        System.out.println(localTime);
        System.out.println(localTime.getHour());
    }
}
