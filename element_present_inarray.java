package com.company;
import java.util.Scanner;
public class element_present_inarray {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int n= scan.nextInt();
        int [] num=new int[n];
        System.out.print("Enter element to be searched in array: ");
        int number= scan.nextInt();
        boolean isInarray=false;
        for (int i=0;i<n;i++){
            System.out.print("Enter "+i+" element: ");
            num[i]= scan.nextInt();
        }
        for (int element:num){
            if (number==element){
                isInarray=true;
                break;
            }
        }
        if(isInarray){
            System.out.println("The element is present in array!");
        }
        else{
            System.out.println("The element is not present in array!");
        }
    }
}
