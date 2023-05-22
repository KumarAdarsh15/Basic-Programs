package com.company;
import java.util.Scanner;
public class ch3_substring_comparison {
    static String samllestandlargest(String sc,int k){
        String smallest=sc.substring(0,k),largest=sc.substring(0,k);
        int n=sc.length();
        for (int i=1;i<=n-k;i++){
            String temp=sc.substring(i,i+k);
            largest=largest.compareTo(temp)>0?largest:temp;
            smallest=smallest.compareTo(temp)<0?smallest:temp;
        }
        return smallest+"\n"+largest;
    }
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter a string:");
        String sc= scan.nextLine();
        System.out.print("Enter size of substring:");
        int n= scan.nextInt();
        System.out.println(samllestandlargest(sc,n));
    }
}
