package com.itheima.demo13serializestream;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

/*
    ObjectOutputStream序列化流
        public ObjectOutputStream(OutputStream out) throws IOException	将基础的字节输出流包装成对象字节输出流
        public final void writeObject(Object obj) throws IOException	将对象写入文件中
 */
public class Demo1 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        create();
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("day03-file-io/e.txt"));
        ArrayList<User> list = (ArrayList<User>) ois.readObject();
        for (User user : list) {
            System.out.println(user);
        }
    }

    private static void create() throws IOException {
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("day03-file-io/e.txt"));
        User user1 = new User("柳岩1","123abc");
        User user2 = new User("柳岩2","124abc");
        User user3 = new User("柳岩3","125abc");
        User user4 = new User("柳岩4","126abc");
        ArrayList<User> list = new ArrayList<>();
        Collections.addAll(list,user1,user2,user3,user4);
        oos.writeObject(list);
        oos.close();
    }
}
