package com.company;

public class Dog extends Animal {
    public static int counter;
    private int id;
    public Dog(String name){
        super(name);
        this.id=++counter;
        System.out.println("Вы создали "+id+" собаку");
    }
    @Override
    public void run(int distance){
        if (distance<=500)
        System.out.println("Собака "+getName()+" пробежала " + distance + " м");
        else System.out.println("Собака "+getName()+" не смогла пробежать " + distance + " м");
    }
    @Override
    public void swim(int distance){
        if (distance<=10)
        System.out.println("Собака "+getName()+" проплыла " + distance + " м");
        else System.out.println("Собака "+getName()+" не смогла проплыть " + distance + " м");
    }
}
