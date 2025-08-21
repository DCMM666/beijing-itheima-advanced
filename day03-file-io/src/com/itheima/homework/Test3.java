package com.itheima.homework;

import java.io.File;

public class Test3 {
    public static void main(String[] args) {
        searchFile(new File("E:\\game"),"GetQzonehistory-latest.exe");

    }

    public static void searchFile(File dir, String name) {
        if (dir == null || !(dir.exists()) || dir.isFile()) {
            return;
        }
        File[] files = dir.listFiles();
        if (files != null && files.length > 0) {
            for (File file : files) {
                if (file.isFile()) {
                    if(file.getName().equals(name)){
                        System.out.println("找到了!"+file.getAbsoluteFile());
                        return;
                    }
                }else {
                    searchFile(file,name);
                }
            }
        }
    }
}
