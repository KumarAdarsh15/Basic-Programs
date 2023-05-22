package com.company;
import java.util.Scanner;
public class strings_question {
    public static void main(String[] args){
        Scanner X = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = X.nextLine();
        //Problem 1
        str = str.toLowerCase();
        System.out.println(str);
        //Problem 2
        str = str.replace(" ","_");
        System.out.println(str);
        //Problem 3
        String letter = "Dear <|name|>, Thanks a lot!";
        letter = letter.replace("<|name|>",str);
        System.out.println(letter);
        //Problem 4
        System.out.println(str.indexOf("  "));
        //Problem 5
        System.out.println("Dear Adarsh\n\tWHy so SERIOUS!");
    }
}
