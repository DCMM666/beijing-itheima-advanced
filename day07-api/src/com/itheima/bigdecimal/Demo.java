package com.itheima.bigdecimal;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Demo {
    public static void main(String[] args) {
        BigDecimal bigDecimal1 = new BigDecimal("0.1");
        BigDecimal bigDecimal2 = new BigDecimal("0.02");
        System.out.println("加:"+bigDecimal1.add(bigDecimal2));
        System.out.println("减:"+bigDecimal1.subtract(bigDecimal2));
        System.out.println("乘:"+bigDecimal1.multiply(bigDecimal2));
        System.out.println("除:"+bigDecimal1.divide(bigDecimal2));
        BigDecimal b = BigDecimal.valueOf(10);
        BigDecimal b1 = BigDecimal.valueOf(3);
        //有参除法
        System.out.println("除:"+b.divide(b1,2, RoundingMode.HALF_UP));
        BigDecimal newBig = b.divide(b1, 3, RoundingMode.HALF_UP);
        double v = newBig.doubleValue();
        System.out.println(v);
        System.out.println(newBig.setScale(2, RoundingMode.UP));
    }
}
