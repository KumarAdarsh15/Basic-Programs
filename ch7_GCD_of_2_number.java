package com.company;
import java.util.Scanner;
public class ch7_GCD_of_2_number {
    static int GCD(int x,int y){
        int min=0,GCD=0;
        if (y>x)
            min=x;
        else
            min=y;
        for (int i=1;i<=min+1;i++){
            if(x%i==0 && y%i==0){
                GCD=i;
            }
        }
        return GCD;
    }
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter 1st number: ");
        int n1= scan.nextInt();
        System.out.print("Enter 2nd number: ");
        int n2= scan.nextInt();
        System.out.print("Highest common divisor of "+n1+" & "+n2+" : "+GCD(n1,n2));
    }
}
