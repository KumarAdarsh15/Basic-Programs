package com.company;
import java.util.Scanner;
public class addition_of_2_matrix {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter number of rows of matrix: ");
        int n=scan.nextInt();
        System.out.print("Enter number of column of matrix: ");
        int m=scan.nextInt();
        int [][]matrix1=new int[n][m];
        int [][]matrix2=new int[n][m];
        int [][]result=new int[n][m];
        System.out.print("**Enter matrix 1 elements**\n");
        for (int i=0;i<n;i++){
           for (int j=0;j<m;j++){
               System.out.print("["+(i+1)+(j+1)+"]: ");
               matrix1[i][j]= scan.nextInt();
           }
        }
        System.out.print("**Enter matrix 2 elements**\n");
        for (int i=0;i<n;i++){
            for (int j=0;j<m;j++){
                System.out.print("["+(i+1)+(j+1)+"]: ");
                matrix2[i][j]= scan.nextInt();
            }
        }
        System.out.println("After adding two matrix: ");
        for (int i=0;i<n;i++){
            for (int j=0;j<m;j++){
                result[i][j]=matrix1[i][j]+matrix2[i][j];
                System.out.print(result[i][j]+" ");
            }
            System.out.println();
        }
    }
}
