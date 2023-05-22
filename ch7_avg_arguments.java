package com.company;
import java.util.Scanner;
public class ch7_avg_arguments {
    static int avg(int ...arr){
        int result=0;
        for(int a:arr){
            result +=a;
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter limit: ");
        int n=scan.nextInt();
        int []array=new int[n];
        for (int i=0;i<n;i++){
            System.out.print("Enter "+(i+1)+" element: ");
            array[i]= scan.nextInt();
        }
        System.out.println("Sum: "+avg(array));
        int avg=avg(array)/n;
        System.out.println("Average: "+avg);
    }
}
