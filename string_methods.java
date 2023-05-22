package com.company;
import java.util.Scanner;
public class string_methods {
    public static void main(String[] args) {
        Scanner X = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = X.nextLine();
        System.out.println(name);
        System.out.println(name.length());
        System.out.println(name.toLowerCase());
        System.out.println(name.toUpperCase());
        System.out.println(name.trim());
        System.out.println(name.substring(3));
        System.out.println(name.substring(3,5));
        System.out.println(name.replace('a','t'));
        System.out.println(name.replace("a","xxx"));
        System.out.println(name.startsWith("ad"));
        System.out.println(name.endsWith("rsh"));
        System.out.println(name.charAt(2));
        System.out.println(name.indexOf("m",3));
        System.out.println(name.lastIndexOf("a"));
        System.out.println(name.lastIndexOf("a",8));
        System.out.println(name.equals("Adarsh"));
        System.out.println(name.equalsIgnoreCase("AdArSh"));

    }
}
