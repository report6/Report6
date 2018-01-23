package jp.ac.uryukyu.ie.Rport6_2;

import java.util.Scanner;
public class Main{

public static void main(String[] args){
        System.out.println("これから五目並べゲームします");
        System.out.println("あなたの名前を入力してください");
        Scanner scan = new Scanner(System.in);
        String name1 = scan.next();
        Player1 player1 = new Player1(name1);
        System.out.println("あなたの名前を入力してください");
        String name2 = scan.next();
        Player2 player2 = new Player2(name2);
        //scan.close();
        //Order order = new Order("")
        Board ban = new Board();
        ban.boarddisplay();

        int turn=0;

        while (true){//!player1.isLose() && player2.isLose()==false){
                turn++;
                System.out.printf("%dターン目です\n",turn);
                player1.put(name1,turn);
                //ban.boarddisplay(ban.board());
                turn++;
                System.out.printf("%dターン目です\n",turn);
                player2.put(name2);
                //ban.boarddisplay(ban.board());
        }
        //System.out.println("試合終了");

    }


}