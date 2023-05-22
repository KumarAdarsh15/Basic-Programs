package com.company;
import java.util.Scanner;
public class max__min_element {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int n=scan.nextInt();
        int []arr=new int[n];
        int max=Integer.MIN_VALUE,min=Integer.MAX_VALUE;
        System.out.println(Integer.MIN_VALUE);
        System.out.println(Integer.MAX_VALUE);
        for(int i=0;i<n;i++){
            System.out.print("Enter "+(i+1)+" element: ");
            arr[i]= scan.nextInt();
        }
        for(int element:arr){
            if(element>max){
                max=element;
            }
            if(element<min){
                min=element;
            }
        }
        System.out.println("The minimum element in the array is: "+min);
        System.out.println("The maximum element in the array is: "+max);
    }

}
