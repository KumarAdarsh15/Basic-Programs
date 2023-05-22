package com.company;
import java.util.Scanner;
public class hello_good_day {
    public static void main(String[] args){
        Scanner X = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = X.next();
        System.out.println("Hello "+name+" have a good day!");
    }
}
