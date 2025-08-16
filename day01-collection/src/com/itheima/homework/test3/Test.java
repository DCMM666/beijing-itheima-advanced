package com.itheima.homework.test3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        User user1 = new User("小明", "123");
        User user2 = new User("小红", "456");
        User user3 = new User("小勇", "789");
        ArrayList<User> users = new ArrayList<>();
        Collections.addAll(users, user1, user2, user3);
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("请输入您的用户名:");
            String username = sc.next();
            System.out.println("请输入您的密码:");
            String userPwd = sc.next();
            boolean flag = checkUser(users, username, userPwd);
            if (flag) {
                System.out.println("对不起,您注册的用户已经存在!请直接登录!");
            } else {
                users.add(new User(username, userPwd));
                System.out.println("注册成功!");
                traverseCollection(users);
                break;

            }
        }


    }

    public static boolean checkUser(ArrayList<User> users, String name, String pwd) {
        for (int i = 0; i < users.size(); i++) {
            User user = users.get(i);
            if (user.getName().equals(name) && user.getPassword().equals(pwd)) {
                return true;
            }
        }
        return false;
    }

    public static void traverseCollection(ArrayList<User> users) {
        Iterator<User> it = users.iterator();
        while (it.hasNext()) {
            User user = it.next();
            System.out.println("用户名:" + user.getName());
            System.out.println("密码:" + user.getPassword());
            System.out.println();
        }
    }
}
