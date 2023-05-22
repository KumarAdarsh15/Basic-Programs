package com.company;
import java.util.Scanner;
public class day_by_numbers {
    public static void main(String[] args) {
        Scanner X = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = X.nextInt();

        switch (num) {
            case 1 -> System.out.println("Monday");
            case 2 -> System.out.println("Tuesday");
            case 3 -> System.out.println("Wednesday");
            case 4 -> System.out.println("Thursday");
            case 5 -> System.out.println("Friday");
            case 6 -> System.out.println("Saturday");
            case 7 -> System.out.println("Sunday");
            default -> System.out.println("Only have 7 days in a week!");
        }
    }
}
