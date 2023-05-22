package com.company;
import java.util.Scanner;
public class multiplication_table_reverse {
    public static void main(String[] args) {
        Scanner X = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = X.nextInt();
        System.out.println("*****Multiplication table of "+n+" in reverse:*****");
        for(int i=10;i>0;i--){
            System.out.println(n+"X"+i+"= "+n*i);
        }
    }
}
