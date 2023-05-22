package com.company;
import java.util.Scanner;
public class array_display {
    public static void main(String[] args) {
        Scanner X = new Scanner(System.in);
        System.out.print("Enter number of subjects: ");
        int n=X.nextInt();
        int [] marks=new int [n];
        for(int i=0;i<n;i++){
            System.out.print("Enter subject "+(i+1)+" marks: ");
            marks[i]= X.nextInt();
        }
        for(int i=0;i<n;i++){
            System.out.println("Subject "+(i+1)+" marks: "+marks[i]);
        }
        for(int i=n-1;i>=0;i--){
            System.out.println(marks[i]);
        }
    }
}
