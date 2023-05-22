package com.company;
import java.util.Scanner;
public class ch7_number {
    static int number(int n){
        if(n>0)
            System.out.println("Positive!");
        else if(n<0)
            System.out.println("Negative!");
        else
            System.out.println("Zero!");
        return n;
    }
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter number: ");
        int n= scan.nextInt();
        System.out.println(number(n));
    }
}
