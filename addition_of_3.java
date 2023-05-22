package com.company;
import java.util.Scanner;
public class addition_of_3 {
    public static void main(String[] args){
        Scanner X = new Scanner(System.in);
        System.out.print("Enter number 1: ");
        int num1= X.nextInt();
        System.out.print("Enter number 2: ");
        int num2= X.nextInt();
        System.out.print("Enter number 3: ");
        int num3= X.nextInt();
        int sum = num1+num2+num3;
        System.out.println("The sum of three number is: "+sum);
    }
}
