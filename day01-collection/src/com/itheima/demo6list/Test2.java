package com.itheima.demo6list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Test2 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        Collections.addAll(list,"java入门","枸杞子","宁夏枸杞","人字拖");
        Iterator<String> it = list.iterator();
        while(it.hasNext()){
            String str = it.next();
            if(str.contains("枸杞")){
                it.remove();
            }
        }
        System.out.println(list);

    }
}
