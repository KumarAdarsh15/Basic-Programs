package com.company;
import java.util.Scanner;
public class website {
    public static void main(String[] args) {
        Scanner X = new Scanner(System.in);
        System.out.print("Enter website name: ");
        String website = X.nextLine();
        if(website.endsWith(".org")){
            System.out.println(website+" is organisation website!");
        }
        else if(website.endsWith(".com")){
            System.out.println(website+" is commercial website!");
        }
        else if(website.endsWith(".in")){
            System.out.println(website+" is Indian website!");
        }
        else{
            System.out.println(website+" is not in our data!");
        }
    }
}
