package com.company;
import java.util.Scanner;
public class ch6_buy_sell_stocks {
    static int buyandsell(int sellingPrice[]){
        int buyprice=Integer.MAX_VALUE,maxProfit=0;
        for (int i=0;i<sellingPrice.length;i++){
            if(buyprice<sellingPrice[i]){
                int profit=sellingPrice[i]-buyprice;
                maxProfit=Math.max(maxProfit,profit);
            }
            else
                buyprice=sellingPrice[i];
        }
        return maxProfit;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter number of days:");
        int n=scan.nextInt();
        int sellingprice[]=new int[n];
        for (int i=0;i<n;i++){
            System.out.print("Enter price of stocks for day "+(i+1)+": ");
            sellingprice[i]=scan.nextInt();
        }
        System.out.println(buyandsell(sellingprice));
    }
}
