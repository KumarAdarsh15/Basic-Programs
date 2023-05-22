package com.company;
import java.util.Scanner;
public class ch6_kadanes_algo {
    static void Kadanes(int arr[]){
        int maxSum=Integer.MIN_VALUE,sum=0;
        for (int i=0;i<arr.length;i++){
            sum=sum+arr[i];
            if(sum<0)
                sum=0;
            maxSum=Math.max(sum,maxSum);
        }
        System.out.print(maxSum);
    }
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter size of array:");
        int n=scan.nextInt();
        int arr[]=new int[n];
        for (int i=0;i<n;i++){
            System.out.print("Enter "+(i+1)+" element:");
            arr[i]= scan.nextInt();
        }
        Kadanes(arr);
    }
}
