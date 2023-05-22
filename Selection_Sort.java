package com.company;
import java.util.Scanner;
public class Selection_Sort {
    static void selectionsort(int arr[]){
        for (int i=0;i< arr.length-1;i++){
            int minpos=i;
            for (int j=i+1;j< arr.length;j++){
                if(arr[minpos]>arr[j])
                    minpos=j;
            }
            int temp=arr[minpos];
            arr[minpos]=arr[i];
            arr[i]=temp;
        }
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
        selectionsort(arr);
        System.out.print("Array sorted in ascending order: ");
        for (int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
