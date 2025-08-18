package com.itheima.demo3stream;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

public class StreamDemo3 {
    public static void main(String[] args) {
        // 目标：掌握Stream提供的常用的中间方法，对流上的数据进行处理（返回新流：支持链式编程）
        List<String> list = new ArrayList<>();
        list.add("a张无忌");
        list.add("c周芷若");
        list.add("d赵敏");
        list.add("d赵敏");
        list.add("d赵敏");
        list.add("f张强");
        list.add("b张三丰");
        list.add("e张翠山");

        //  Stream<T> filter(Predicate<? super T> predicate)	用于对流中的数据进行过滤。

        list.stream().filter((String s) -> {
            return s.length() == 4;
        }).forEach((s) -> {
            System.out.println(s);
        });
        System.out.println("------");

        //  Stream<T> sorted()	对元素进行升序排序

        list.stream().sorted().forEach(s -> System.out.println(s));

        //  Stream<T> sorted(Comparator comparator)	按照指定规则排序

        System.out.println("------");
        list.stream().sorted((o1, o2) -> {
            return o2.compareTo(o1);
        }).forEach((s -> System.out.println(s)));

        //  Stream<T> limit(long maxSize)	获取前几个元素

        System.out.println("------");
        list.stream().sorted((o1, o2) -> {
            return o2.compareTo(o1);
        }).limit(4).forEach((s -> System.out.println(s)));

        //  Stream<T> skip(long n)	跳过前几个元素

        System.out.println("------");
        list.stream().sorted((o1, o2) -> {
            return o2.compareTo(o1);
        }).limit(4).skip(2).forEach((s -> System.out.println(s)));

        //  Stream<T> distinct()	去除流中重复的元素。

        System.out.println("------");
        list.stream().distinct().forEach(s -> System.out.println(s));

        //  Stream<R> map(Function mapper)	对元素进行加工，并返回对应的新流

        System.out.println("------");
        ArrayList<String> list2 = new ArrayList<>();
        Collections.addAll(list2, "1", "2", "3", "4");
        list2.stream().map(s -> {
            return Integer.parseInt(s) * 100;
        }).forEach(s -> System.out.println(s));

        //  static <T> Stream<T> concat(Stream a, Stream b)	合并a和b两个流为一个流

        System.out.println("------");
        Stream.concat(list.stream(), list2.stream()).forEach(s -> System.out.println(s));
    }
}
