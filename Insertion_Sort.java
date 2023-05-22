package com.company;
import java.util.Scanner;
public class Insertion_Sort {
    static void insertionsort(int arr[]){
        for (int i=1;i< arr.length;i++){
            int current=arr[i],previous=i-1;
                while(previous>=0&&arr[previous]>current){
                    arr[previous+1]=arr[previous];
                    previous--;
                }
                arr[previous+1]=current;
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
        insertionsort(arr);
        System.out.print("Array sorted in ascending order: ");
        for (int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
