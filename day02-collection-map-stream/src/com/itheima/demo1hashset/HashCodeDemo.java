package com.itheima.demo1hashset;
/*
    同一个对象多次调用hashCode()方法返回的哈希值是相同的。
    不同的对象，它们的哈希值大概率不相等，但也有可能会相等(哈希碰撞)。
 */
public class HashCodeDemo {
    public static void main(String[] args) {
        String s1 = "柳岩";
        String s2 = "李沁";

        System.out.println(s1.hashCode());// 848662
        System.out.println(s1.hashCode());// 848662
        System.out.println(s1.hashCode());// 848662

        System.out.println(s2.hashCode());// 847603

        System.out.println("------------");

        String x = "通话";
        String y = "重地";
        System.out.println(x.hashCode());// 1179395
        System.out.println(y.hashCode());// 1179395
    }
}
