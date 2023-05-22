package com.company;
import java.util.Scanner;
public class ch6_linear_search {
    static void linearsearch(int arr[],int key){
        boolean isInarray=false;
        for (int element:arr){
            if (key==element){
                isInarray=true;
                break;
            }
        }
        if (isInarray)
            System.out.println(key+" is in array");
        else
            System.out.println(key+" is not in array");
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
        linearsearch(arr,key);
    }
}
