package com.itheima.demo7test;

public class Movie {
    private int id;
    private String name;
    private double score;
    private String actor;
    private double price;

    public Movie() {
    }

    public Movie(int id, String name, double score, String actor, double price) {
        this.id = id;
        this.name = name;
        this.score = score;
        this.actor = actor;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public String getActor() {
        return actor;
    }

    public void setActor(String actor) {
        this.actor = actor;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", score=" + score +
                ", actor='" + actor + '\'' +
                ", price=" + price +
                '}';
    }
}
