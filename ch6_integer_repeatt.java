package com.company;
import java.util.Scanner;
public class ch6_integer_repeatt {
    static boolean repeatinteger(int arr[]){
        for (int i=0;i< arr.length-1;i++){
            for (int j=i+1;j< arr.length;j++){
                if (arr[i]==arr[j])
                    return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter size of array:");
        int n= scan.nextInt();
        int arr[]=new int[n];
        for (int i=0;i<n;i++){
            System.out.print("Enter "+(i+1)+" element: ");
            arr[i]=scan.nextInt();
        }
        System.out.print(repeatinteger(arr));
    }
}
