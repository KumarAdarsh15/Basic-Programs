package com.company;
import java.util.Scanner;
public class ch7_greatest_number {
    static int greatest(int x,int y){
        if(x>y)
            return x;
        else
            return y;
    }
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter 1st number: ");
        int n1=scan.nextInt();
        System.out.print("Enter 2nd number: ");
        int n2=scan.nextInt();
        System.out.println("Greatest number: "+greatest(n1,n2));
    }
}
