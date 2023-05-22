package com.company;
import java.util.Scanner;
public class ch7_factorial {
    static int factorial(int n){
        int fact=1;
       for(int i=1;i<=n;i++){
           fact *= i;
       }
       return fact;
    }
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n=scan.nextInt();
        System.out.print("Factorial of "+n+":"+factorial(n));
    }
}
