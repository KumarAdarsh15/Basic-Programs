package com.company;
import java.util.Scanner;
public class sum_5_arrays {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int n= scan.nextInt();
        float [] num=new float[n];
        float sum=0;
        for (int i=0;i<n;i++){
            System.out.print("Enter "+(i+1)+" element: ");
            num[i]= scan.nextFloat();
        }
        System.out.print("Elements to be summed are: ");
        for (int i=0;i<n;i++){
            sum += num[i];
            System.out.print(num[i]+"  ");
        }
        System.out.println();
        System.out.println("Sum = "+sum);
    }
}
