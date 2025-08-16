package com.itheima.demo7test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class MoviesManager {
    // 当前集合容器存储的是电影对象
    private ArrayList<Movie> movies = new ArrayList<>();
    private Scanner sc = new Scanner(System.in);

    // 实例代码块
    {
        Movie movie1 = new Movie(1, "肖申克的救赎", 9.7, "a", 45.5);
        Movie movie2 = new Movie(2, "阿甘正传", 9.5, "a", 42.0);
        Movie movie3 = new Movie(3, "泰坦尼克号", 9.4, "b", 50.0);
        // 批量添加元素
        Collections.addAll(movies, movie1, movie2, movie3);
    }

    public void addMovies(){
        System.out.println("请输入您要添加的电影id:");
        int movieId = sc.nextInt();
        System.out.println("请输入您要添加的电影名称");
        String movieName = sc.next();
        System.out.println("请输入电影的评分:");
        double score = sc.nextDouble();
        System.out.println("请输如电影的作者:");
        String actor = sc.next();
        System.out.println("请输入电影的价格:");
        double price = sc.nextDouble();

        Movie movie = new Movie(movieId,movieName,score,actor,price);
        movies.add(movie);
        System.out.println("上架成功!");
    }
    public void deleteMovie(){
        System.out.println("请输入要下架的电影ID:");
        int id = sc.nextInt();
        for (int i = 0; i < movies.size(); i++) {
            Movie movie = movies.get(i);
            if(movie.getId()==id){
                movies.remove(i);
                i--;
            }
        }
    }
    public void queryAllMovies(){
        if(movies.size()==0){
            System.out.println("暂无电影请添加后再试!");
            return;
        }
        for (Movie movie : movies) {
            System.out.println("电影id:"+movie.getId());
            System.out.println("电影名字:"+movie.getName());
            System.out.println("电影评分:"+movie.getScore());
            System.out.println("电影导演:"+movie.getActor());
            System.out.println("电影价格:"+movie.getPrice());
            System.out.println();
        }

        System.out.println("查询成功");
    }
    public void deleteMovies(){
        System.out.println("请输入要删除的导演名字");
        String actor = sc.next();
        for (int i = 0; i < movies.size(); i++) {
            Movie movie = movies.get(i);
            if(movie.getActor().equals(actor)){
                movies.remove(i);
                i--;
            }
        }
        System.out.println("删除成功");
    }
}
