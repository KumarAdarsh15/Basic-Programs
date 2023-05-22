package com.company;
import java.util.Scanner;
public class ch6_pairs_in_array {
    static void pairsinarray(int arr[]){
        int count=0;
        for (int i=0;i< arr.length;i++){
            for (int j=i+1;j<arr.length;j++){
                System.out.print("("+arr[i]+","+arr[j]+")");
                count++;
            }
            System.out.println();
        }
        System.out.println(count);
    }
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter size of array:");
        int n= scan.nextInt();
        int arr[]=new int[n];
        for (int i=0;i<n;i++){
            System.out.print("Enter "+(i+1)+" element:");
            arr[i]= scan.nextInt();
        }
        pairsinarray(arr);
    }
}
