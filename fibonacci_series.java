package com.company;
import java.util.Scanner;
public class fibonacci_series {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter limit: ");
        int n=scan.nextInt();
        int a=0,b=1,c;
        System.out.print("Fibonacci series: ");
        for (int i=1;i<=n;i++){
            c=a+b;
            System.out.print(c+" ");
            a=b;
            b=c;
        }
    }
}
