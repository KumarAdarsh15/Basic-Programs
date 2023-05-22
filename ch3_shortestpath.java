package com.company;
import java.util.Scanner;
public class ch3_shortestpath {
    static void shortestpath(String path){
        int x=0,y=0;
        for (int i=0;i<path.length();i++){
            char sc=path.charAt(i);
            if (sc=='S'||sc=='s')
                y--;
            else if (sc=='N'||sc=='n')
                y++;
            else if (sc=='W'||sc=='w')
                x--;
            else
                x++;
        }
        int x2=x*x,y2=y*y;
        System.out.println("Shortest path to cover "+path+" : "+Math.sqrt(x2+y2));
    }
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter the directions initials:");
        String path= scan.next();
        shortestpath(path);
    }
}
