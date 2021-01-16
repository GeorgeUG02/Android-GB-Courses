package com.company;

public class Main {

    public static void main(String[] args) {
	    Employee[] employees=new Employee[5];
        employees[0]=new Employee("Anton E.","programmer","antone@mail.ru","+79184351720","150000RUB",45);
        employees[1]=new Employee();
        employees[1].fullName="Alex M.";
        employees[1].age=34;
        employees[2]=new Employee();
        employees[2].fullName="Svetlana A.";
        employees[2].age=42;
        employees[3]=new Employee();
        employees[3].fullName="Anna K.";
        employees[3].age=37;
        employees[4]=new Employee();
        employees[4].fullName="Peter P.";
        employees[4].age=48;
        for(Employee emp:employees){
            if(emp.age>40) emp.printInfo();
        }

    }
}
