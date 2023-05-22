package com.company;
import java.util.Scanner;
public class ch7_fibonacci_series {
    static int fibonacci(int n){
            if(n==1 || n==2){
                return n-1;
            }
            else{
                return fibonacci(n-1)+fibonacci(n-2);
            }
    }
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n=scan.nextInt();
        for (int i=1;i<=n;i++)
            System.out.println(fibonacci(n));
    }
}
