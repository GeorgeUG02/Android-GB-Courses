package com.company;

public class Plate {
    private int food;

    public void putFood(int amount) {
        this.food += amount;
        System.out.println("Food filled, now there's " + food);
    }

    public void decreaseFood(int amount) {
        this.food -= amount;
        System.out.println("Food decreased, now there's " + food);

    }

    public int getFood() {
        return food;
    }
}
