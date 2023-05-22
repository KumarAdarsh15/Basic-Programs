package com.company;
public class ch7_varargs {
    static int sum(int ...arr){
        int result=0;
        for(int a:arr){
            result+=a;
        }
        return result;
    }
    public static void main(String[] args) {
        System.out.println("2+4= "+sum(2,4));
        System.out.println("2+4+5= "+sum(2,4,5));
        System.out.println("2+4+5+9= "+sum(2,4,5,9));
    }
}
