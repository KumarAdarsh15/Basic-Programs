package com.company;
import java.util.Scanner;
public class ch7_sum_off_odd {
    static int oddsum(int n){
        int temp,sum=0;;
        System.out.print("Odd numbers: ");
        for (int i=1;i<=n;i++){
            temp=i;
            if(temp%2!=0){
                System.out.print(temp+" ");
                sum += temp;
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter limit: ");
        int n= scan.nextInt();
        System.out.println("\nAnd the sum: "+oddsum(n));
    }
}
