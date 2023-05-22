package com.company;
import java.util.Scanner;
public class student_prcentage {
    public static void main(String[] args){
        Scanner X = new Scanner(System.in);
        System.out.print("Enter the maximum marks a subject: ");
        int marks = X.nextInt();
        marks = marks*3;
        System.out.print("Enter subject 1,2,3 marks: ");
        float sub1 = X.nextFloat();
        System.out.print("Enter subject 2 marks: ");
        float sub2 = X.nextFloat();
        System.out.print("Enter subject 3 marks: ");
        float sub3 = X.nextFloat();
        float total = ((sub1+sub2+sub3)/marks)*100;
        if(sub1 >= 33 && sub2 >= 33 && sub3 >= 33 && total >= 40){
            System.out.println("You have passed!");
        }
        else{
            System.out.println("Sorry mate, we failed to teach you!");
        }
        System.out.println(total+"%");
    }
}
