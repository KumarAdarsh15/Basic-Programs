package com.company;
import java.util.Scanner;
public class Quick_Sort {
    public static void display(int arr[]){
        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i]+" ");
    }
    public static int partition(int arr[],int low,int high){
        int pivot=arr[(low+high)/2];
        while (low<=high){
            while (arr[low]<pivot)
                low++;
            while (arr[high]>pivot)
                high--;
            if(low<=high){
                int temp=arr[low];
                arr[low]=arr[high];
                arr[high]=temp;
                low++;
                high--;
            }
        }
        return low;
    }
    public static void quicksort(int arr[],int low,int high){
        int pIdx=partition(arr,low,high);
        if (low<pIdx-1)
            quicksort(arr,low,pIdx-1);
        if (pIdx<high)
            quicksort(arr,pIdx,high);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int arr[]=new int[5];
        for (int i=0;i<arr.length;i++)
            arr[i]= sc.nextInt();
        quicksort(arr,0, arr.length-1);
        display(arr);
    }
}
