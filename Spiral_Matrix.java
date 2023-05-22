package com.company;
import java.util.Scanner;
public class Spiral_Matrix {
    static void spiralmatrix(int matrix[][]){
        int startrow=0,startcolumn=0;
        int endrow=matrix.length-1,endcolumn=matrix[0].length-1;
        while(startrow<=endrow && startcolumn<=endcolumn){
            //top
            for (int j=startcolumn;j<=endcolumn;j++){
                System.out.print(matrix[startrow][j]+" ");
            }
            //right
            for (int i=startrow+1;i<=endrow;i++){
                System.out.print(matrix[i][endcolumn]+" ");
            }
            //bottom
            for (int j=endcolumn-1;j>=startcolumn;j--){
                if (startrow==endrow)
                    break;
                System.out.print(matrix[endcolumn][j]+" ");
            }
            //left
            for (int i=endrow-1;i>=startrow+1;i--){
                if (startcolumn==endcolumn)
                    break;
                System.out.print(matrix[i][startcolumn]+" ");
            }
            startcolumn++;
            startrow++;
            endcolumn--;
            endrow--;
        }
    }
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter number of rows:");
        int n= scan.nextInt();
        System.out.print("Enter number of column:");
        int m= scan.nextInt();
        int matrix[][]=new int[n][m];
        for (int i=0;i<n;i++){
            for (int j=0;j<m;j++){
                System.out.print("["+(i+1)+","+(j+1)+"]:");
                matrix[i][j]= scan.nextInt();
            }
        }
        spiralmatrix(matrix);
    }
}
