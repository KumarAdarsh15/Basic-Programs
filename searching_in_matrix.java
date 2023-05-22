package com.company;
import java.util.Scanner;
public class searching_in_matrix {
    static void printmatrix(int matrix[][]){
        for (int i=0;i< matrix.length;i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
    static void searchinsortedmatrix(int matrix[][],int key){
        //top right corner
        /*int row=0,column=matrix[0].length-1;
        while (row< matrix.length && column>=0){
            if(matrix[row][column]==key){
                System.out.print(key+" found at ["+row+","+column+"]");
                break;
            }
            else if (key<matrix[row][column])
                column--;
            else
                row++;
        }*/
        //bottom left corner
        int row= matrix.length-1,column=0;
        while (row>=0 && column<matrix[0].length){
            if (matrix[row][column]==key){
                System.out.print(key+" found at ["+row+","+column+"]");
                break;
            }
            else if (key<matrix[row][column])
                row--;
            else
                column++;
        }
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
        System.out.print("Enter the element to be searched:");
        int key= scan.nextInt();
        searchinsortedmatrix(matrix,key);
    }
}
