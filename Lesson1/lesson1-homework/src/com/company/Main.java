package com.company;

public class Main {

    public static void main(String[] args) {
         byte x1=1;
         short x2=10;
         int x3=100;
         long x4=1000L;
         boolean x5=true;
         float x6=1.5f;
         double x7=1.55;
         char x8='a';
         String s="text";
    }
    public static float calculate (float a,float b,float c,float d){
        return a*(b+(c/d));
    }
    public static boolean task10and20 (int a,int b){
        return (10<=a+b) && (a+b<=20);
    }
    public static void isPositiveOrNegative(int x){
        if(x>=0){
            System.out.println("Positive");
        }
        else{
            System.out.println("Negative");
        }
    }
    public static boolean isNegative(int x){
        if (x<0){
            return true;
        }
        return false;
    }
    public static void greetings(String name){
        System.out.println("Привет, "+name);
    }
    public static void isLeap(int year){
         if (year % 4==0){
             if (year % 100!=0) System.out.println(year+" - This year is leap");
             else if(year % 400==0) System.out.println(year+" - This year is leap");
             else System.out.println(year+" - This year is not leap");
         }
         else System.out.println(year+" - This year is not leap");
    }
}
