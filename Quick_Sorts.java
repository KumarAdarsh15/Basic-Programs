package com.company;
import java.util.Scanner;
public class Quick_Sorts {
    public static void Display(int arr[]){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
    public static int partition(int arr[],int si,int ei){
        int pivot=arr[ei];
        int i=si-1;
        for (int j=0;j<ei;j++){
            if(arr[j]<pivot){
                i++;
                int temp=arr[j];
                arr[j]=arr[i];
                arr[i]=temp;
            }
        }
        i++;
        int temp=pivot;
        arr[ei]=arr[i];
        arr[i]=temp;
        return i;
    }
    public static void quicksort(int arr[],int si,int ei){
        if(si>=ei)
            return;
        int pIdx=partition(arr,si,ei);
        quicksort(arr,si,pIdx-1);
        quicksort(arr,pIdx+1,ei);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int arr[]=new int[4];
        for (int i = 0; i < arr.length; i++) {
            arr[i]= sc.nextInt();
        }
        quicksort(arr,0, arr.length-1);
        Display(arr);
    }
}
