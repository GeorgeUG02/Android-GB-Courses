package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Box <T extends Fruit>{
       private ArrayList<T> al;
       public Box(){
           al=new ArrayList<>();
       }
       public void put(T... arr){
           Collections.addAll(al,arr);
       }
       public ArrayList<T> getList(){
           return al;
       }
       public  float  getWeight(){
           if (al.size()==0) return 0;
           if (al.get(0) instanceof Apple) return 1.0f*al.size();
           else return 1.5f*al.size();
       }
       public boolean compare(Box<?> b){
           return this.getWeight()==b.getWeight();
       }
       public void pour(Box<T> b){
           for(T t:b.getList()){
               al.add(t);
           }
           b.getList().clear();
           ArrayList<T> ab=b.getList();
           ab.clear();
       }
}
