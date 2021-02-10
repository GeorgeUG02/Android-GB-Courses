package com.company;


import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Integer[] i = {5,10,35,20,50};
        swap(i,2,3);
        ArrayList<Integer> al=transform(i);
        System.out.println(al);
        Box<Apple> a=new Box<>();
        Box<Apple> a2=new Box<>();
        Box<Orange> b= new Box<>();
        Apple[] apples={new Apple(),new Apple(),new Apple()};
        Apple[] apples2={new Apple(),new Apple()};
        Apple apple=new Apple();
        Orange[] oranges={new Orange(),new Orange(),new Orange(),new Orange()};
        System.out.println(a.getWeight());
        a.put(apples);
        System.out.println(a.getWeight());
        b.put(oranges);
        System.out.println(b.getWeight());
        System.out.println(a.compare(b));
        a2.put(apples2);
        a.pour(a2);
        System.out.println(a.getWeight());
        a.put(apple);
        System.out.println(a.getWeight());
        System.out.println(a.compare(b));
    }
    public static <T> void swap(T[] arr,int n1,int n2){
        T temp=arr[n1];
        arr[n1]=arr[n2];
        arr[n2]=temp;
    }
    public static <T> ArrayList<T> transform(T[] arr){
        return new ArrayList<>(Arrays.asList(arr));
    }
}
