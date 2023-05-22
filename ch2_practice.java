package com.company;
import java.util.*;
public class ch2_practice {
    public static void main(String[] args) {
        float a = (float) (7.0/4.0 * 9.0/2.0);
        int b = 7*49/7 + 35/7;
        System.out.println(a);
        System.out.println(b);
        //comparison
        int x = 22;
        Scanner Y = new Scanner(System.in);
        int z = Y.nextInt();
        System.out.println(x>z);
        //encrypt by adding 8 & decrypt by subtracting 8
        char a1 = 'b';
        a1 = (char)(a1 + 8);
        System.out.println(a1);

        a1 = (char)(a1 - 8);
        System.out.println(a1);
    }
}
