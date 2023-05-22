package com.company;
import java.util.Scanner;
interface ChessPlayer{
    void moves();
}
class Queen implements ChessPlayer{
    public void moves(){
        System.out.println("Up,Down,Right,Left,Diagoal(all 4 direction)");
    }
}
class Rook implements ChessPlayer{
    public void moves(){
        System.out.println("Up,Down,Right,Left");
    }
}
public class ch11_Interfaces {
    public static void main(String[] args) {
        Queen q=new Queen();
        q.moves();
        Rook r=new Rook();
        r.moves();
    }
}
