package com.company;
import java.util.Scanner;
public class per_of_5_sub {
    public static void main(String[] args){
        Scanner X = new Scanner(System.in);
        System.out.print(" Enter the max marks of a Subjects: ");
        int max= X.nextInt();
        max= max*5 ;
        System.out.print("Enter subject 1 marks: ");
        int subj1 = X.nextInt();
        System.out.print("Enter subject 2 marks: ");
        int subj2 = X.nextInt();
        System.out.print("Enter subject 3 marks: ");
        int subj3 = X.nextInt();
        System.out.print("Enter subject 4 marks: ");
        int subj4 = X.nextInt();
        System.out.print("Enter subject 5 marks: ");
        int subj5 = X.nextInt();
        float total = subj1+subj2+subj3+subj4+subj5;
        System.out.println("Total marks: "+total);
        float percentage = (total/max)*100;
        System.out.println("Percentage: " +percentage);
    }
}
