package com.company;
import java.util.Scanner;
public class ch3_String_Palindrome {
    static void isPalindrome(String sc){
        boolean palindrome=true;
        int length=sc.length();
        for (int i=0;i<length/2;i++){
            if(sc.charAt(i)!=sc.charAt(length-i-1))
                palindrome=false;
        }
        if (palindrome)
            System.out.print(sc+" is a palindrome");
        else
            System.out.print(sc+" is not a palindrome");
    }
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter a string:");
        String sc= scan.next();
        isPalindrome(sc);
    }
}
