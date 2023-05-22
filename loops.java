package com.company;
public class loops {
    public static void main(String[] args) {
        //while loop
        System.out.println("Natural numbers from 100 to 200");
        int num = 100;
        while(num<=200) {
            System.out.println(num);
            num++;
        }
        //do-while loop
        System.out.println("First n natural numbers");
        int n = 1;
        do{
            System.out.println(n);
            n++;
        }while(n<=20);
        //for loop
        System.out.println("First n natural odd numbers:");
        int n1 = 20;
        for(int i=0;i<n1;i++){
            System.out.println(2*i+1);
        }
        System.out.println("First n natural odd numbers in reverse order:");
        for(int i=n1;i>0;i--){
            System.out.println(2*i+1);
        }
    }
}
