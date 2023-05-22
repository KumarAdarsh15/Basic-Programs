package com.company;
import java.util.Scanner;
public class ch6_suarrays_sum {
    static void subarrayssum(int arr[]){
        int sum=0,maxsum=Integer.MIN_VALUE;
        for (int i=0;i< arr.length;i++){
            for (int j=i;j< arr.length;j++){
                sum=0;
                for (int k=i;k<=j;k++){
                    sum += arr[k];
                }
                System.out.print(sum+" ");
                if(maxsum<sum){
                    maxsum=sum;
                }
            }
        }
        System.out.println("\nMaximum sum="+maxsum);
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
        subarrayssum(arr);
    }
}
