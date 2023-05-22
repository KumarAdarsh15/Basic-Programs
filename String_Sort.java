package com.company;
import java.util.Scanner;
public class String_Sort {
    public static void StringSort(String str[]){
        for (int i = 0; i < str.length; i++) {
            for (int j = 0; j < str.length-1-i; j++) {
                if(str[j].compareTo(str[j+1])>0){
                    String temp=str[j];
                    str[j]=str[j+1];
                    str[j+1]=temp;
                }
            }
        }
        for (int i = 0; i < str.length; i++) {
            System.out.print(str[i]+" ");
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter size of string: ");
        int n=sc.nextInt();
        String []str=new String[n];
        for (int i = 0; i < str.length; i++) {
            str[i]= sc.next();
        }
        StringSort(str);
    }
}
