package com.company;
import java.util.Scanner;
public class Merge_sort {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter size of 1st array:");
        int n= scan.nextInt();
        int arr1[]=new int[n];
        for (int i=0;i<n;i++){
            System.out.print("Enter "+(i+1)+" element:");
            arr1[i]= scan.nextInt();
        }
        System.out.print("Enter size of 2nd array:");
        int m= scan.nextInt();
        int arr2[]=new int[m];
        for (int i=0;i<n;i++){
            System.out.print("Enter "+(i+1)+" element:");
            arr2[i]= scan.nextInt();
        }
        int l= arr1.length+ arr2.length;
        int arr[]=new int[l];
        for (int i=0;i< arr1.length;i++)
            arr[i]=arr1[i];
        for (int i= arr1.length+1;i< arr2.length;i++)
            arr[arr1.length+1]=arr2[i];

        for (int i=0;i< arr.length;i++)
            System.out.print(arr[i]+" ");
    }
}
