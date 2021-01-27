package com.company;

public class Wall implements Obstacle{
    private int height;
    public Wall(int height){
        this.height=height;
    }
    @Override
    public void overcome(Entity e){
         e.jump(height);
    }
}
