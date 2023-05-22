package com.company;
import java.util.Scanner;
public class array_sorted_or_not {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int n=scan.nextInt();
        int []arr=new int[n];
        boolean isSorted=true;
        for(int i=0;i<n;i++){
            System.out.print("Enter "+(i+1)+" element: ");
            arr[i]= scan.nextInt();
        }
        for (int i=0;i<n-1;i++){
            if(arr[i]>arr[i+1]){
                isSorted=false;
            }
        }
        if(isSorted){
            System.out.println("The array is sorted!,in ascending order");
        }
        else{
            System.out.println("The array is not sorted!");
        }
    }
}
