package com.company;
import java.util.Scanner;
class Complex{
    int real,imaginary;
    Complex(int r,int i){
        this.real=r;
        this.imaginary=i;
    }
    static Complex add(Complex a,Complex b){
        return new Complex((a.real+b.real),(a.imaginary+b.imaginary));
    }
    static Complex difference(Complex a,Complex b){
        return new Complex((a.real-b.real),(a.imaginary-b.imaginary));
    }
    static Complex product(Complex a,Complex b){
        return new Complex((a.real*b.real)-(a.imaginary* b.imaginary),(a.real*b.imaginary)+(a.imaginary* b.real));
    }
    void printComplex(){
        if(real==0 && imaginary!=0){
            System.out.println(imaginary+"i");
        }
        else if(real!=0 && imaginary==0){
            System.out.println(real+"r");
        }
        else {
            System.out.println(real+"r"+imaginary+"i");
        }
    }
}
public class ch11_cmplx_numbers {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Complex c=new Complex(sc.nextInt(), sc.nextInt());
        Complex d=new Complex(sc.nextInt(), sc.nextInt());

        Complex e=Complex.add(c,d);
        Complex f=Complex.difference(c,d);
        Complex g=Complex.product(c,d);

        e.printComplex();
        f.printComplex();
        g.printComplex();
    }
}
