package com.company;
import java.util.Scanner;
public class sum_multiplication_table {
    public static void main(String[] args) {
        Scanner X = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = X.nextInt();
        int sum=0;
        System.out.println("*****Multiplication table of "+num+" is:*****");
        for(int i=1;i<=10;i++){
            System.out.println(num+"X"+i+"= "+num*i);
            sum += (num*i);
        }
        System.out.println("Sum of "+num+" multiplication table is: "+sum);
    }
}
