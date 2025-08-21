package com.itheima.data;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DataDemo {
    public static void main(String[] args) throws ParseException {
        //空参构造获取当前时间
        Date date = new Date();
/*        System.out.println(date);
        //有参构造 参数是long类型的毫秒值,指的是1970/1/1日加该毫秒值后的日期
        Date date1 = new Date(1000L*60*60*24);
        System.out.println(date1);
        //空参构造获取当前时间距离1970/1/1日的毫秒值
        System.out.println(date.getTime());
        date.setTime(1000L*60*60*24);//设置日期:1970年一月一日加该毫秒值的日期
        System.out.println(date);
        System.out.println(System.currentTimeMillis());*/
        //计算活了多少天
        String barth = "2002-4-24";
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date parseDate = sdf.parse(barth);
        long barthTime = parseDate.getTime();
        long time = date.getTime();
        long days = (time - barthTime) / (1000L * 60 * 60 * 24);
        System.out.println(days);

        //2025-8-15加100天等于多少
        String datStr = "2025-8-15";
        long millisecond = sdf.parse(datStr).getTime();
        Date newDate = new Date(millisecond+1000L*60*60*24);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy年MM月dd日");
        String format = simpleDateFormat.format(newDate);
        System.out.println(format);


    }
}
