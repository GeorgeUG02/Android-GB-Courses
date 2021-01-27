package com.company;

public interface Entity {
    public boolean isParticipating();
    public int getMaxHeight();
    public int getMaxDistance();
    public void run(int distance);
    public void jump(int height);
}
