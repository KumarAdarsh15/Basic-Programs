package com.company;
import java.util.Scanner;
public class odd_number_sum {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter limit: ");
        int n= scan.nextInt();
        int temp,sum=0;
        System.out.print("Odd numbers: ");
        for (int i=1;i<=n;i++){
            temp=i;
            if(temp%2!=0){
                System.out.print(temp+" ");
                sum += temp;
            }
        }
        System.out.println();
        System.out.print("And there sum: ");
        System.out.print(sum);
    }
}
