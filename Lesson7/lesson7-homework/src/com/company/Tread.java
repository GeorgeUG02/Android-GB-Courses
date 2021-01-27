package com.company;

public class Tread implements Obstacle{
      private int distance;
      public Tread(int distance){
          this.distance=distance;
      }
      @Override
      public void overcome(Entity e){
           e.run(distance);
      }
}
