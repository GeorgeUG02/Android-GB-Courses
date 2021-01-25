package com.company;

public class Main {

    public static void main(String[] args) {
	     Cat[] cats={
            new Cat("Murzik",20),
            new Cat("Barsik",15),
            new Cat("Kitty",25),
            new Cat("Tommy",30),
            new Cat("Mikky",10)
        };
	     Plate p = new Plate();
	     p.putFood(50);
	     cats[0].eat(p);
         cats[1].eat(p);
         cats[2].eat(p);
         cats[3].eat(p);
         cats[4].eat(p);
    }
}
