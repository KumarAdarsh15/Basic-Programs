package com.company;
import java.util.Scanner;
public class ch6_transpose_matrix {
    static void printmatrix(int matrix[][]){
        for (int i=0;i< matrix.length;i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
    static void transposeofmatrix(int matrix[][]){
        int tranpose[][]=new int[matrix[0].length][matrix.length];
        for (int i=0;i<matrix.length;i++){
            for (int j=0;j< matrix[0].length;j++){
                tranpose[j][i]=matrix[i][j];
            }
        }
        printmatrix(tranpose);
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
        printmatrix(matrix);
        transposeofmatrix(matrix);
    }
}
