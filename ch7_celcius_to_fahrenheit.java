package com.company;
import java.util.Scanner;
public class ch7_celcius_to_fahrenheit {
    static float celtofar(int degree){
        float far= (float)((degree * 9) / 5) + 32;
        return far;
    }
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter celsius: ");
        int n=scan.nextInt();
        System.out.println("Celsius = "+n+" -> fahrenheit = "+celtofar(n));
    }
}
