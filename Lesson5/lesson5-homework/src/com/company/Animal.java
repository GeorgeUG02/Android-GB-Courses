package com.company;

public abstract class Animal {
    private String name;
    public static int counter;
    private int id;
    public Animal(String name){
        this.name=name;
        this.id=++counter;
        System.out.println("Вы создали "+id+" животное");
    }

    public String getName() {
        return name;
    }

    public void run(int distance){
        System.out.println("Животное "+getName()+" пробежало " + distance + " м");
    }
    public void swim(int distance){
        System.out.println("Животное "+getName()+" проплыло " + distance + " м");
    }
}
