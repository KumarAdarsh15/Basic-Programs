package com.company;
import java.util.Scanner;
public class factorial {
    public static void main(String[] args) {
        Scanner X = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = X.nextInt();
        int fact = 1;
        int i=1;
        /*for (int i=1;i<=n;i++){
            fact *= i;
        }*/
        while(i<=n){
            fact *= i;
            i++;
        }
        System.out.println("Factorial of "+n+" is: "+fact);
    }
}
