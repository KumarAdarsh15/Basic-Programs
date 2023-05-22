package com.company;
import java.util.Scanner;
class Calculator2 extends RuntimeException{
    Calculator2(String msg){
        super(msg);
    }
    public String getMessage(){
        return "Invalid Input!";
    }
}
public class Custom_Calculator {
    public static int add(int a, int b) throws Calculator2 {
        if (a > 10000 || b > 10000) {
            throw new Calculator2("Max input Exception: input should not be greater than 10000");
        }
        return a + b;
    }

    public static int multiply(int a, int b) throws Calculator2 {
        if (a > 7000 || b > 7000) {
            throw new Calculator2("Max input Exception: input should not be greater than 7000");
        }
        return a * b;
    }

    public static float divide(int a, int b) throws Calculator2 {
        if (a > 7000 || b > 7000) {
            throw new Calculator2("Max input Exception: input should not be greater than 7000");
        }
        if (b == 0) {
            throw new ArithmeticException("Cannot divide by zero Exception");
        }
        return (float) a / b;
    }
    public static void main(String[] args) {
        /*
        Exercise 6: You have to create a custom calculator with following operations:
        1. + -> Addition
        2. - -> Subtraction
        3. * -> Multiplication
        4. / -> Division
        which throws the following exceptions:
        1. Invalid input Exception ex: 8 & 9
        2. Cannot divide by 0 Exception
        3. Max Input Exception if any of the inputs is greater than 100000
        4. Max Multiplier Reached Exception - Don't allow any multiplication input to be greater than 7000
         */
        Scanner sc=new Scanner(System.in);
        while(true){
            System.out.println("Press 1 operator for addition");
            System.out.println("Press '-' operator for subtraction");
            System.out.println("Press '*' operator for multiplication");
            System.out.println("Press '/' operator for division");
            System.out.println("Press '0' to exit");
            System.out.print("Enter your choice: ");
            int ch= sc.nextInt();
            switch (ch){
                case 1 : System.out.println("Enter number 1 and number 2:");
                    int a1 = sc.nextInt(),b1 = sc.nextInt();
                    try {
                        int res = add(a1, b1);
                        System.out.println("The result is " + res);
                    } catch (Calculator2 e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 0:System.exit(0);
                break;
            }
        }
    }
}
