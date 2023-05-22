package com.company;
import java.util.Scanner;
public class ch3_substring {
    static String substring(String sc,int start,int end){
        String sustr="";
        for (int i=start;i<end;i++){
            sustr+=sc.charAt(i);
        }
        return sustr;
    }
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter a string:");
        String sc= scan.nextLine();
        //System.out.println(substring(sc,0,6));
        System.out.println(sc.substring(0,6));
    }
}
