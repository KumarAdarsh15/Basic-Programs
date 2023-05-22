package com.company;
import java.util.Scanner;
public class Trapped_water {
    static int trapped_water(int boundary[]){
        int n= boundary.length;
        //left max of arr[]
        int left_max[]=new int[n];
        left_max[0]= boundary[0];
        for (int i=1;i< n;i++){
            left_max[i]=Math.max(boundary[i],left_max[i-1]);
        }
        //right max of arr[]
        int right_max[]=new int[n];
        right_max[n-1]= boundary[n-1];
        for (int i=n-2;i>=0;i--){
            right_max[i]=Math.max(boundary[i],right_max[i+1]);
        }
        int trapped_water=0,width=1;
        for(int i=0;i< n;i++){
            //waterlevel=min(leftmax[i],rightmax[i])
            int waterlevel=Math.min(left_max[i], right_max[i]);
            //trappedwater=(waterlevel-boundary[i])*width
            trapped_water+=(waterlevel-boundary[i])*width;
        }
        return trapped_water;
    }
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter size of array:");
        int n= scan.nextInt();
        int boundary[]=new int[n];
        for(int i=0;i<n;i++){
            System.out.print("Enter "+(i+1)+" boundary height:");
            boundary[i]= scan.nextInt();
        }
        System.out.print(trapped_water(boundary));
    }
}
