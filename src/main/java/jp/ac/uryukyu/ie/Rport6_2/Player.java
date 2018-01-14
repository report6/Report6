package jp.ac.uryukyu.ie.Rport6_2;

import java.io.PrintStream;
import java.util.Scanner;

public class Player {

    private boolean position;
    private int count;
    private String name;

    public Player(boolean position,int count,String name){
        this.count = count;
        this.name = name;
        System.out.print("あなたの名前を入力してください");
        Scanner scan = new Scanner(System.in);
        name = scan.next();
    }

    public void main(){
        Scanner scan = new Scanner(System.in);
        System.out.printf("%sの番です",name);
        System.out.printf("置く場所を決めてください");
        int num = scan.nextInt();
    }

    public boolean isEmpty(){
        //指定した場所が空かどうか調べる

    }

    public boolean getEmpty(){

    }

    public boolean isMine (){
        //指定した場所に自分の石を置いてあるか調べる
    }

    public boolean getMine () {

    }

    public boolean isOpponent (){
        //指定した場所に相手の石が置いてあるか調べる
    }

    public boolean getOpponent (){

    }



    public void put (){
        //指定した場所に石を置く
    }

    public void win(){
        System.out.printf("%sの勝利です",name);
    }

    public void lose(){
        System.out.printf("%sの負けです",name);
    }


