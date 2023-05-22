package com.company;
import java.util.Scanner;
public class ch7_prime_or_not {
    static boolean primeornot(int n){
        if(n==2)
            return true;
        for (int i=2;i<=n-1;i++){
            if(n%i==0)
                return false;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter a number:");
        int n= scan.nextInt();
        System.out.println(n+" is prime: "+primeornot(n));
    }
}
