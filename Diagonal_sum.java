package com.company;
import java.util.Scanner;
public class Diagonal_sum {
    static void diagonalsum(int matrix[][]) {
        int sum = 0;
        for (int i = 0; i < matrix.length; i++) {
            /*for (int j = 0; j < matrix[0].length; j++) {
                if (i==j)
                    sum+=matrix[i][j];
                if (i+j== matrix.length-1)
                    sum+=matrix[i][j];
            }*/
            sum+=matrix[i][i];
            if (i!=matrix.length-i-1)
                sum+=matrix[i][matrix.length-i-1];
        }
        System.out.println(sum);
    }
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter rows and column of matrix:");
        int n= scan.nextInt();
        int matrix[][]=new int[n][n];
        for (int i=0;i<n;i++){
            for (int j=0;j<n;j++){
                System.out.print("["+(i+1)+","+(j+1)+"]:");
                matrix[i][j]= scan.nextInt();
            }
        }
        diagonalsum(matrix);
    }
}
