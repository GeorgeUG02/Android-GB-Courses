package com.company;


public class Cat {
    private String name;
    private int appetite;
    private boolean satiety=false;
    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
    }

    public void eat(Plate plate) {
        if (plate.getFood()>=appetite) {
            plate.decreaseFood(appetite);
            System.out.println("Cat ate for " + appetite);
            this.satiety=true;
        }
        else{
            System.out.println("There is not enough food in the plate");
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAppetite() {
        return appetite;
    }

    public void setAppetite(int appetite) {
        this.appetite = appetite;
    }

}

