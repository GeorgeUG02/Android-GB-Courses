package com.company;

public class MyArrayDataException extends RuntimeException{
    public MyArrayDataException(int x,int y){
        super();
        System.out.println("В ячейке {"+x+","+y+"} лежат значения типа не int");
    }
}
