package com.company;

public class Man implements Entity{
    private final int maxHeight=3;
    private final int maxDistance=2000;
    private boolean isParticipating=true;
    public void jump(int height){
        if (height<=maxHeight)
        System.out.println("The man jumped on "+height+" m");
        else {System.out.println("The man can't jump on such height");isParticipating=false;}
    }

    @Override
    public boolean isParticipating() {
        return isParticipating;
    }

    @Override
    public int getMaxHeight() {
        return maxHeight;
    }

    @Override
    public int getMaxDistance() {
        return maxDistance;
    }

    public void run(int distance){
        if(distance<=maxDistance)
        System.out.println("The man ran "+distance+" m");
        else {System.out.println("The man can't run such distance");isParticipating=false;}
    }
}
