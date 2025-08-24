package com.itheima.demo2reflect;

import java.io.IOException;

public class Test {
    public static void main(String[] args) throws IOException, IllegalAccessException {
        Student student = new Student("钟晨瑶",18,"演戏");
        Teacher teacher = new Teacher("杨",25,"讲课",10000,"429",'男',"15110563215");
        SaveObjectFrameWork.saveObject(student);
        SaveObjectFrameWork.saveObject(teacher);
    }
}
