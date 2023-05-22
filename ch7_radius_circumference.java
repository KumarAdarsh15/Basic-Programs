package com.company;
import java.util.Scanner;
public class ch7_radius_circumference {
    static float circumference_to_radius(float r){
        return (float) (2*3.14*r);
    }
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter the radius: ");
        float r= scan.nextFloat();
        System.out.print("Radius= "+r+" -> Circumference= "+circumference_to_radius(r));
    }
}
