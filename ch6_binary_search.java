package com.company;
import java.util.Scanner;
public class ch6_binary_search {
    static int binarysearch(int arr[],int key){
        int start=0,end= arr.length-1,mid=0;
        while(start<=end){
            mid=(start+end)/2;
            if(arr[mid]==key)
                return mid;
            else if (arr[mid]<key)
                start=mid+1;
            else
                end=mid-1;
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int n=scan.nextInt();
        int arr[]=new int[n];
        for (int i=0;i<n;i++){
            System.out.print("Enter "+(i+1)+" element: ");
            arr[i]= scan.nextInt();
        }
        System.out.print("Enter element to be searched in array: ");
        int key=scan.nextInt();
        System.out.println(key+" is in array at index: "+binarysearch(arr,key));
    }
}
