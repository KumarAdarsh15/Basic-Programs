package com.company;
import java.util.Arrays;
import java.util.Scanner;
public class ch3_anagrams {
    static void Anagrams(String str1,String str2){
        if(str1.length()==str2.length()){
            //String to char
            char[] str1charArray=str1.toCharArray();
            char[] str2charArray=str2.toCharArray();
            //char sorted
            Arrays.sort(str1charArray);
            Arrays.sort(str2charArray);
            //comparison
            boolean result=Arrays.equals(str1charArray,str2charArray);
            if (result)
                System.out.println("Anagrams");
            else
                System.out.println("Not Anagrams");
        }
        else
            System.out.println("Not Anagrams");
    }
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter 1st string:");
        String str1= scan.nextLine();
        System.out.print("Enter 2nd string:");
        String str2= scan.nextLine();
        str1=str1.toLowerCase();
        str2=str2.toLowerCase();
        Anagrams(str1,str2);
    }
}
