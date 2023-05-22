package com.company;
import java.util.Scanner;
public class ch6_count {
    static void countkey(int matrix[][],int key){
        int count=0;
        for (int i=0;i<matrix.length;i++){
            for (int j=0;j<matrix[0].length;j++){
                if (matrix[i][j]==key)
                    count++;
            }
        }
        System.out.println(count);
    }
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter rows of matrix:");
        int n= scan.nextInt();
        System.out.print("Enter column of matrix:");
        int m= scan.nextInt();
        int matrix[][]=new int[n][m];
        for (int i=0;i<n;i++){
            for (int j=0;j<m;j++){
                System.out.print("["+(i+1)+","+(j+1)+"]:");
                matrix[i][j]= scan.nextInt();
            }
        }
        System.out.print("Enter the key element:");
        int key= scan.nextInt();
        countkey(matrix,key);
    }
}
