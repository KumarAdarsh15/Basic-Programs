package com.company;
import java.util.Scanner;
public class kilometers_miles {
    public static void main(String[] args) {
        Scanner X = new Scanner(System.in);
        System.out.print("Enter kilometer's: ");
        int kilo = X.nextInt();
        float miles = (float) (kilo * 0.62);
        System.out.println("Kilometer: "+kilo+" -> Miles: "+miles);
    }
}
