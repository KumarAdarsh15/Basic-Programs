package com.company;
import java.util.Scanner;
public class ch7_eligible_or_not {
    static int eligible_for_vote(int P){
        if(P>18)
            System.out.println("You can vote!");
        else
            System.out.println("You can't vote!");
        return P;
    }
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter age: ");
        int age= scan.nextInt();
        System.out.print("Your are: "+eligible_for_vote(age));
    }
}
