package com.company;
import java.util.Scanner;
public class ch7_primes_in_range {
    static boolean isPrime(int n){
        if(n==2)
            return true;
        for(int i=2;i<=n-1;i++){
            if(n%i==0)
                return false;
        }
        return true;
    }
    static void primesinrange(int n){
        for(int i=2;i<=n;i++){
            if(isPrime(i))
                System.out.print(i+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter range:");
        int n= scan.nextInt();
        primesinrange(n);
    }
}
