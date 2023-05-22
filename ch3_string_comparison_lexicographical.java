package com.company;
import java.util.Scanner;
public class ch3_string_comparison_lexicographical {
    static String largest(String sc[]){
        String largest=sc[0],smallest=sc[sc.length-1];
        for (int i=1;i<sc.length;i++){
            if (largest.compareToIgnoreCase(sc[i])<0)
                largest=sc[i];
            if (smallest.compareToIgnoreCase(sc[i])>0)
                smallest=sc[i];
        }
        return largest;
    }
    static String smallest(String sc[]){
        String smallest=sc[sc.length-1];
        for (int i=1;i<sc.length;i++){
            if (smallest.compareToIgnoreCase(sc[i])>0)
                smallest=sc[i];
        }
        return smallest;
    }
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter number of Strings:");
        int n= scan.nextInt();
        String sc[]=new String[n];
        for (int i=0;i<n;i++){
            System.out.print("Enter "+i+" String:");
            sc[i]= scan.nextLine();
        }
        System.out.println(largest(sc));
        System.out.println(smallest(sc));
    }
}
