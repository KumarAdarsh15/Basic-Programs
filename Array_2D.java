package com.company;
import java.util.Scanner;
public class Array_2D {
    static void searchKey(int matrixs[][],int key) {
        for (int i = 0; i < matrixs.length; i++) {
            for (int j = 0; j < matrixs[0].length; j++) {
                if (matrixs[i][j] == key){
                    System.out.print("Key element found at cell [" + (i + 1) + "," + (j + 1) + "]");
                }
            }
        }
    }
    static void largestandsmall(int matrix[][]){
        int largest=Integer.MIN_VALUE,smallest=Integer.MAX_VALUE;
        for (int i=0;i<matrix.length;i++){
            for (int j=0;j<matrix[0].length;j++){
                if (matrix[i][j]>largest)
                    largest=matrix[i][j];
                if (matrix[i][j]<smallest)
                    smallest=matrix[i][j];
            }
        }
        System.out.println("\nLargest element: "+largest);
        System.out.println("Smallest element: "+smallest);
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter number of rows:");
        int n = scan.nextInt();
        System.out.print("Enter number of column:");
        int m = scan.nextInt();
        int matrix[][] = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print("Enter [" + (i + 1) + "," + (j + 1) + "]: ");
                matrix[i][j] = scan.nextInt();
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }

        System.out.print("Enter element to be searched:");
        int keys= scan.nextInt();
        searchKey(matrix,keys);
        largestandsmall(matrix);
    }
}
