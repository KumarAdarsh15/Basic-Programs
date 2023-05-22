package com.company;
import java.util.Scanner;
class Employee{
    String name;
    int id,age,salary;
    void printdetails(){
        System.out.println("My name is: "+name);
        System.out.println(" , id : "+id);
        System.out.println("and age : "+age);
    }
    int getSalary(){
        return salary;
    }
}
public class ch8_costume_class {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Employee e1=new Employee();
        e1.name=sc.next();
        e1.id=sc.nextInt();e1.age=sc.nextInt();e1.salary=sc.nextInt();
        int salary_e1=e1.getSalary();
        e1.printdetails();
        System.out.println(salary_e1);
    }
}
