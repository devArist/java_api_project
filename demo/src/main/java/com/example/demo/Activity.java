package com.example.demo;

public class Activity{
    private final long id;
    private String name;

    public Activity(long id, String name){
        this.id = id;
        this.name = name;
    }

    public int getId(){
        return this.id;
    }
    public String getName(){
        return this.name;
    }
    public void setName(String name){
        this.name = name;
    }
}