package com.company;

public class sum_even_number {
    public static void main(String[] args) {
        int i=0,sum=0;
        /*while(i<3){
            System.out.print(2*i+"\t");
            sum=sum+2*i;
            i++;
        }*/
        for(i=0;i<3;i++){
            System.out.print(2*i+"\t");
            sum=sum+2*i;
        }
        System.out.println("\nSum of first even number is:"+sum);
    }
}
