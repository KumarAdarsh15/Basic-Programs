package com.company;
import java.util.Scanner;
public class ch7_sumrec_natural {
    static int sumRec(int n){
        if(n==1){
            return 1;
        }
        else{
            return n+sumRec(n-1);
        }
    }
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n=scan.nextInt();
        System.out.println("Sum of first "+n+" natural numbers is: "+sumRec(n));
    }
}
