package com.itheima.demo8copy;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

//C:\Users\DCMM\Pictures\4e18e603d87cecd59f816afb8fdf900a.jpg
public class CopyDemo1 {
    public static void main(String[] args) {
        // 目标：使用字节流完成文件的复制操作。
        try (FileInputStream fis = new FileInputStream("C:\\Users\\DCMM\\Pictures\\4e18e603d87cecd59f816afb8fdf900a.jpg");
             BufferedInputStream bis = new BufferedInputStream(fis);
             FileOutputStream fos = new FileOutputStream("day03-file-io/a.jpg");
             BufferedOutputStream bos = new BufferedOutputStream(fos);
        ) {
            byte[] bys = new byte[1024];
            int len;
            while ((len = bis.read(bys)) != -1) {
                bos.write(bys, 0, len);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void method() {
        try (FileInputStream fis = new FileInputStream("C:\\Users\\DCMM\\Pictures\\4e18e603d87cecd59f816afb8fdf900a.jpg");
             FileOutputStream fos = new FileOutputStream("day03-file-io/a.jpg");
        ) {
/*            int by;
            while((by=fis.read())!=-1){
                fos.write(by);
            }*/
            byte[] bys = new byte[1024];
            int len;
            while ((len = fis.read(bys)) != -1) {
                fos.write(bys, 0, len);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
