package com.company;
import java.util.Scanner;
public class ch7_multiplication_table {
    static void mulTable(int n){
        for (int i=1;i<=10;i++){
            System.out.println(n+"X"+i+"= "+n*i);
        }
    }
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n=scan.nextInt();
        System.out.println("Multiplication table of "+n);
        mulTable(n);
    }
}
