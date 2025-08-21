package com.itheima.demo5trywithresource;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/*
    从JDK7开始提供了更简单的资源释放方案：try-with-resource
    try (定义资源1; 定义资源2;...) {
        可能出现异常的代码
     } catch (异常类名 变量名) {
        异常处理的代码
    }

    特点 : 小括号中的资源使用完毕后，会自动调用close()方法，完成对资源的释放
 */
public class Demo2 {
    public static void main(String[] args) {
        try (FileReader fr = new FileReader("day03-file-io/a.txt");
             FileWriter fw = new FileWriter("day03-file-io/b.txt")) {
            char[] chs = new char[1024];
            int len;
            while ((len = fr.read(chs)) != -1) {
                fw.write(chs, 0, len);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
