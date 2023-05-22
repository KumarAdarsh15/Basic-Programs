package com.company;
import java.util.Scanner;
public class cgpa_3_sub {
    public static void main(String[] args) {
        Scanner X = new Scanner(System.in);
        System.out.print("Enter the max marks of a Subjects: ");
        int max= X.nextInt();
        max *= 3;
        System.out.print("Enter subject 1 marks: ");
        int subj1 = X.nextInt();
        System.out.print("Enter subject 2 marks: ");
        int subj2 = X.nextInt();
        System.out.print("Enter subject 3 marks: ");
        int subj3 = X.nextInt();
        float total = subj1+subj2+subj3;
        System.out.println("Total marks: "+total);
        float cgpa = (total/max)*10;
        System.out.println("cgpa: "+cgpa);
    }
}
