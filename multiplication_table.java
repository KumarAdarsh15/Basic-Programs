package com.company;
import java.util.Scanner;
public class multiplication_table {
    public static void main(String[] args) {
        Scanner X = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = X.nextInt();
        System.out.println("*****Multiplication table of "+num+" is:*****");
        for(int i=1;i<=10;i++){
            System.out.println(num+"X"+i+"= "+num*i);
        }
    }
}
