package com.company;
import java.util.Scanner;
public class tax_slab {
    public static void main(String[] args) {
        Scanner X = new Scanner(System.in);
        System.out.print("Enter your yearly income: ");
        int income = X.nextInt();
        float tax = 0.0f;
        if(income<=250000){
            tax = tax + 0;
        }
        else if(income>250000 && income<=500000){
            tax = (tax + 0.05f * (income - 250000));
        }
        else if(income>500000 && income<=1000000){
            tax = (tax + 0.05f * (500000 - 250000));
            tax = (tax + 0.2f * (income - 500000));
        }
        else{
            tax = (tax + 0.05f * (500000 - 250000));
            tax = (tax + 0.2f * (1000000 - 500000));
            tax = (tax + 0.2f * (income - 1000000));
        }
        System.out.println(tax);
    }
}
