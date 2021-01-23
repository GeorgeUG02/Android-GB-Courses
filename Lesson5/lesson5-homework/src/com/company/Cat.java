package com.company;

public class Cat extends Animal{
    public static int counter;
    private int id;
    public Cat(String name){
        super(name);
        this.id=++counter;
        System.out.println("Вы создали "+id+" кота");
    }
    @Override
    public void run(int distance){
        if (distance<=200)
        System.out.println("Кот "+getName()+" пробежал " + distance + " м");
        else System.out.println("Кот "+getName()+" не смог пробежать " + distance + " м");
    }
    @Override
    public void swim(int distance){
        System.out.println("Кот "+getName()+" не умеет плавать");
    }
}
