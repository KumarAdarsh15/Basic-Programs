package com.company;
import java.util.Scanner;
public class ch6_subarrays {
    static void subarrays(int arr[]){
        int count=0;
        for (int i=0;i< arr.length;i++){
            for (int j=i;j< arr.length;j++){
                for (int k=i;k<=j;k++){
                    System.out.print("("+arr[k]+")");
                }
                count++;
                System.out.print(" ");
            }
            System.out.println();
        }
        System.out.println(count);
    }
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int n=scan.nextInt();
        int arr[]=new int[n];
        for (int i=0;i<n;i++){
            System.out.print("Enter "+(i+1)+" element: ");
            arr[i]= scan.nextInt();
        }
        subarrays(arr);
    }
}
