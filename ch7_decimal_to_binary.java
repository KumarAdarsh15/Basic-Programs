package com.company;
import java.util.Scanner;
public class ch7_decimal_to_binary {
    static void DecimaltoBinary(int n){
        int lastdigit=0,binary=0,pow=0;
        while(n>0){
            lastdigit=n%2;
            binary=binary+(lastdigit*(int)Math.pow(10,pow));
            pow++;
            n=n/2;
        }
        System.out.println(binary);
    }
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter a decimal number:");
        int n= scan.nextInt();
        DecimaltoBinary(n);
    }
}
