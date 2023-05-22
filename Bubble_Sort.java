package com.company;
import java.util.Scanner;
public class Bubble_Sort {
    static void bubblesort(int arr[]){
        for (int i=0;i< arr.length-1;i++){
           boolean swap=false;
            int count=0;
            for (int j=0;j< arr.length-1-i;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    swap=true;
                    count++;
                }
                if (!swap)
                    break;
            }
            System.out.println("Swapping upto: "+count);
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
        bubblesort(arr);
        System.out.print("Array sorted in ascending order: ");
        for (int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
