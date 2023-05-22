package com.company;
import java.util.Scanner;
public class ch6_subarraysum_prefix {
    static void prefixsum_subarray(int arr[]){
        int sum=0,maxSum=Integer.MIN_VALUE;
        int prefix[]=new int[arr.length];
        prefix[0]=arr[0];
        for (int i=1;i< arr.length;i++){
            prefix[i]=prefix[i-1]+arr[i];
        }
        for (int i=0;i< arr.length;i++){
            for (int j=i;j< arr.length;j++){
                sum=i==0?prefix[j]:prefix[j]-prefix[i-1];
            }
            if(maxSum<sum)
                maxSum=sum;
        }
        System.out.println("\n"+maxSum);
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
        prefixsum_subarray(arr);
    }
}
