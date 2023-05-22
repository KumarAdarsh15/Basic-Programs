package com.company;
import java.util.Scanner;
public class ch3_compare_string {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter 1st string:");
        String sc1= scan.next();
        System.out.print("Enter 2nd string:");
        String sc2= scan.next();
        if(sc1.equals(sc2))
            System.out.println("Equal");
        else
            System.out.println("Not Equal");
    }
}
