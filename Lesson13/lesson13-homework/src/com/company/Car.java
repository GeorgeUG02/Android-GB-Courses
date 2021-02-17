package com.company;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.CyclicBarrier;

public class Car implements Runnable{
    private static int CARS_COUNT;
    private Race race;
    private int speed;
    private String name;
    private static boolean flag=false;
    private static CyclicBarrier cb;
    private static CountDownLatch cdl1;
    private static CountDownLatch cdl2;
    public Car(Race race, int speed, CountDownLatch cdl1, CountDownLatch cdl2) {
        this.cdl1=cdl1;
        this.cdl2=cdl2;
        this.race = race;
        this.speed = speed;
        CARS_COUNT++;
        this.name="Участник #" + CARS_COUNT;
        cb=new CyclicBarrier(CARS_COUNT);
    }

    public String getName() {
        return name;
    }

    public int getSpeed() {
        return speed;
    }


    @Override
    public void run() {

        try {
            System.out.println(this.name + " готовится");
            cb.await();
            Thread.sleep(500+(int)(Math.random()*800));
            System.out.println(this.name + " готов");
            cb.await();
        } catch (Exception e) {
            e.printStackTrace();
        }
        cdl1.countDown();
        for (int i=0;i<race.getStages().size();i++){
            race.getStages().get(i).go(this);
        }
        if(!flag) {
            System.out.println(getName() + " - WIN");
            flag=true;
        }
        cdl2.countDown();
    }
}
