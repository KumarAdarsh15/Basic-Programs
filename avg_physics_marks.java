package com.company;
import java.util.Scanner;
public class avg_physics_marks {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int n=scan.nextInt();
        float [] marks=new float[n];
        float avg=0,sum=0;
        for (int i=0;i<n;i++){
            System.out.print("Enter student "+i+" physics marks: ");
            marks[i]= scan.nextFloat();
        }
        for (int i=0;i<n;i++){
            sum = sum+marks[i];
            avg=sum/n;
        }
        System.out.println("Average of all student physics marks = "+avg);
    }
}
