package com.company;
import java.util.Scanner;
public class ch7_reverse_pattern {
    static void pattern(int n){
        for(int i=n;i>0;i--){//for rows
            for(int j=1;j<=i;j++){//for printing stars
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n=scan.nextInt();
        pattern(n);
    }
}
