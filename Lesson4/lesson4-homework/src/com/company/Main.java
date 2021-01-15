package com.company;

public class Main {

    public static void main(String[] args) {
	    Employee[] employees=new Employee[5];
        employees[0]=new Employee("Anton","programmer","anton@mail.ru","+79184351720","50000RUB",45);
        employees[1]=new Employee();
        employees[1].fullName="Alex";
        employees[1].age=34;
        employees[2]=new Employee();
        employees[2].fullName="Svetlana";
        employees[2].age=42;
        employees[3]=new Employee();
        employees[3].fullName="Anna";
        employees[3].age=37;
        employees[4]=new Employee();
        employees[4].fullName="Peter";
        employees[4].age=48;
        for(Employee emp:employees){
            if(emp.age>40) emp.printInfo();
        }

    }
}
