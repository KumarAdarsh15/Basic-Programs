package com.company;
import java.util.Scanner;
public class ch3_reverse_string {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter a string:");
        String sc=scan.next();
        String screv="";
        for (int i=sc.length()-1;i>=0;i--){
            char ch=sc.charAt(i);
            screv=screv+ch;
        }
        System.out.println(screv);
        if (sc.equals(screv))
            System.out.println("Palindrome");
        else
            System.out.println("Palindrome");
    }
}
