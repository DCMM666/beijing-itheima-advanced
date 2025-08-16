package com.itheima.demo7test;

import java.util.ArrayList;
import java.util.Scanner;

public class MovieTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MoviesManager manager = new MoviesManager();
        while (true) {
            System.out.println("---------欢迎来到电影管理系统------------");
            System.out.println("1: 上架电影");
            System.out.println("2: 下架电影");
            System.out.println("3: 查询全部电影");
            System.out.println("4: 下架某个主演的全部电影");
            System.out.println("5: 退出系统");
            System.out.println("请输入您的选择");
            int input = sc.nextInt();
            switch (input){
                case 1:
                    manager.addMovies();
                    break;
                case 2:
                    manager.deleteMovie();
                    break;
                case 3:
                    manager.queryAllMovies();
                    break;
                case 4:
                    manager.deleteMovies();
                    break;
                case 5:
                    System.out.println("欢迎下次使用");;
                    return;
                default:
                    System.out.println("您录入的数据有误!");
                    break;

            }
        }
    }
}
