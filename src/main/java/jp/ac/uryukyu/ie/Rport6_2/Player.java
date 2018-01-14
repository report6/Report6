package jp.ac.uryukyu.ie.Rport6_2;

import java.util.Scanner;

public class Player {

    private boolean position;
    private int count;
    private String name;
    Board ban = new Board();

    public Player(String name) {
        this.name = name;
        System.out.printf("%sの番です", name);
        System.out.printf("置く場所を決めてください");
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        int num2 = scan.nextInt();
        ban.board()[num][num2]=;

    }

/*
    public boolean isEmpty() {
        //指定した場所が空かどうか調べる

    }

    public boolean getEmpty() {

    }

    public boolean isMine() {
        //指定した場所に自分の石を置いてあるか調べる
    }

    public boolean getMine() {

    }

    public boolean isOpponent() {
        //指定した場所に相手の石が置いてあるか調べる
    }

    public boolean getOpponent() {

    }


    public void put() {
        //指定した場所に石を置く
    }
    */

    public void win() {
        System.out.printf("%sの勝利です", name);
    }

    public void lose() { System.out.printf("%sの負けです", name); }
}


