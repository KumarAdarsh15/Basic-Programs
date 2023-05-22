package com.company;
import java.util.Scanner;
class Student{
    String name,stream;
    int roll,year;
    Student(){  //non-parameterized constructors
        name="Adarsh";
        roll=22;
    }
    Student(String name,String stream){  //parameterized constructors
        this.name=name;
        this.stream=stream;
    }
    Student(int roll,int year){  //parameterized constructors
        this.roll=roll;
        this.year=year;
    }
    String getName(){
        return name;
    }
    int getroll(){
        return roll;
    }
}
public class ch9_constructors {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Student st1=new Student();
        Student st2=new Student("Rishu","ECE");
        Student st3=new Student(22,5);
        System.out.println(st1.getName());
        System.out.println(st1.getroll());
        /*System.out.println(st2.getName());
        System.out.println(st2.getroll());
        System.out.println(st3.getName());
        System.out.println(st3.getroll());*/
    }
}
