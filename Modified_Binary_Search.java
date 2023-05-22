package com.company;
import java.util.Scanner;
public class Modified_Binary_Search {
    public static int search(int arr[],int target,int si,int ei){
        if(si>ei)
            return -1;
        int mid=(si+ei)/2;
        if(arr[mid]==target)
            return mid;
        else if(arr[si]<=arr[mid]){
            if(arr[si]<=target&&target<=arr[mid])
                return search(arr,target,si,mid-1);
            else
                return search(arr,target,mid+1,ei);
        }
        else {
            if(arr[mid]<=target&&target<=arr[ei])
                return search(arr,target,mid+1,ei);
            else
                return search(arr,target,si,mid-1);
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int arr[]=new int[7];
        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextInt();
        }
        int target=sc.nextInt();
        int tIdx=search(arr,target,0,arr.length-1);
        System.out.println(tIdx);
    }
}
