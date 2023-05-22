package com.company;
import java.util.Scanner;
public class leap_year {
    public static void main(String[] args) {
        Scanner X = new Scanner(System.in);
        System.out.println("Enter year: ");
        int year = X.nextInt();

        if(year%4==0 && year%100!=0){
            System.out.println(year+" is a leap year");
        }
        else if(year%400==0){
            System.out.println(year+" is a leap year");
        }
        else{
            System.out.println(year+" is not a leap year");
        }
    }
}
