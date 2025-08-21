package com.itheima.homework.test3;

import java.util.HashSet;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        HashSet<User> hashSet = new HashSet<>();
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("请输入您的用户名:");
            String username = sc.next();
            if (username.equals("end")) {
                return;
            }
            boolean flag = checkUserName(hashSet, username);
            if (flag) {
                System.out.println("用户名存在!");
            } else {
                System.out.println("请输入密码:");
                String password = sc.next();
                User user = new User(username, password);
                if (hashSet.add(user)) {
                    System.out.println("注册成功!");
                    printSetInfo(hashSet);
                }
            }

        }


    }

    public static void printSetInfo(HashSet<User> hashSet) {
        for (User user : hashSet) {
            System.out.println("用户名:" + user.getUsername());
        }
    }

    public static boolean checkUserName(HashSet<User> hashSet, String username) {
        for (User user : hashSet) {
            if (user.getUsername().equals(username)) {
                return true;
            }
        }
        return false;
    }
}
