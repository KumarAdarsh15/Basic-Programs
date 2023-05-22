package com.company;
import java.util.Scanner;
public class ch7_binary_to_decimal {
    static void BinarytoDecimal(int n){
        int lastdigit=0,decimal=0,pow=0;
        while(n>0){
            lastdigit=n%10;
            decimal=decimal+(lastdigit*(int)Math.pow(2,pow));
            pow++;
            n=n/10;
        }
        System.out.println(decimal);
    }
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter a binary number:");
        int n= scan.nextInt();
        BinarytoDecimal(n);
    }
}
