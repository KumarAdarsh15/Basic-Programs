package com.company;
import java.util.Scanner;
import java.util.Random;

public class extra_problem {
    public static void main(String[] args){

                Scanner sc = new Scanner(System.in);
                Random rand = new Random();

                int comp_choice = rand.nextInt(3); // taking computer input (random)

                System.out.println("0 --> Rock\n1--> Paper\n2--> Scissors\n");
                System.out.print("What do you chose:\t");
                int user_choice = sc.nextInt(); // taking user input

                // Game Logic
                System.out.printf("You chose %d\n", user_choice);
                System.out.printf("Computer chose %d\n", comp_choice);


                if (comp_choice == user_choice) {
                    System.out.println("Its a draw!");
                } else if (comp_choice == 0) {
                    if (user_choice == 1) {
                        System.out.println("You Won");
                    } else if (user_choice == 2) {
                        System.out.println("Computer Won");
                    }
                } else if (comp_choice == 1) {
                    if (user_choice == 0) {
                        System.out.println("Computer Won");
                    } else if (user_choice == 2) {
                        System.out.println("You Won");
                    }
                } else if (comp_choice == 2) {
                    if (user_choice == 0) {
                        System.out.println("You Won");
                    } else if (user_choice == 1) {
                        System.out.println("Computer Won");
                    }
                }

            }
        }
