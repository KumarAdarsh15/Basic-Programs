package com.company;
import java.util.Scanner;
public class ch7_patter_rec {
    static void pattern_rec(int n){
        if(n>0){
            pattern_rec(n-1);
            for (int i=1;i<=n;i++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int n=scan.nextInt();
        pattern_rec(n);
    }
}
