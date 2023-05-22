package com.company;
import java.util.Scanner;
class bank{
    String name;
    int id;
    private String passsword;

    bank() {
        System.out.println("Enter your old bank account details:-");
    }

    void setPasssword(String passsword){
        this.passsword=passsword;
    }
    String getPasssword(){
        return passsword;
    }
    bank(bank b1){
        this.name=b1.name;
        this.id=b1.id;
    }
}
public class ch9_copy_constructor {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        bank b1=new bank();
        b1.name= sc.next();
        b1.id= sc.nextInt();
        b1.setPasssword(sc.next());

        bank b2=new bank(b1);
        System.out.println("Set a new password: ");
        b2.setPasssword(sc.next());
        System.out.println(b2.name);
        System.out.println(b2.id);
        System.out.println(b2.getPasssword());
    }
}
