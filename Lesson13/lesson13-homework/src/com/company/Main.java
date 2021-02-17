package com.company;


import java.util.concurrent.CountDownLatch;

public class Main {
    public static final int CARS_COUNT=4;
    public static void main(String[] args) throws InterruptedException {
        System.out.println( "ВАЖНОЕ ОБЪЯВЛЕНИЕ >>> Подготовка!!!" );
        final CountDownLatch cdl1=new CountDownLatch(CARS_COUNT);
        final CountDownLatch cdl2=new CountDownLatch(CARS_COUNT);
        Race race = new Race(new Road(60),new Tunnel(),new Road(40));
        Car[] cars = new Car[CARS_COUNT];
        for (int i=0;i< cars.length;i++){
            cars[i]=new Car(race,20+ (int)(Math.random()*10),cdl1,cdl2);
        }
        for (int i=0;i< cars.length;i++) {
            new Thread(cars[i]).start();
        }

        cdl1.await();
        System.out.println(  "ВАЖНОЕ ОБЪЯВЛЕНИЕ >>> Гонка началась!!!" );
        cdl2.await();
        System.out.println(  "ВАЖНОЕ ОБЪЯВЛЕНИЕ >>> Гонка закончилась!!!" );
    }
}
