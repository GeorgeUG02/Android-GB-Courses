package com.company;

public class Employee {
    String fullName;
    String position;
    String email;
    String phoneNumber;
    String salary;
    int age;
    public Employee(){

    }
    public Employee(String fullName,String position,String email,String phoneNumber,String salary,int age){
        this.fullName=fullName;
        this.position=position;
        this.email=email;
        this.phoneNumber=phoneNumber;
        this.salary=salary;
        this.age=age;
    }
    void printInfo(){
        System.out.println(fullName+" "+position+" "+email+ " "+ phoneNumber+" "+salary+" "+age);
    }
}
