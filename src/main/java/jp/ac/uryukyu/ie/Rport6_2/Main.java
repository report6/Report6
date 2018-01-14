package jp.ac.uryukyu.ie.Rport6_2;

import java.util.Scanner;
public class Main{

public static void main(String[] args){
        String name1,name2;
        System.out.println("これから五目並べゲームします");
        System.out.print("あなたの名前を入力してください");
        Scanner scan = new Scanner(System.in);
        name1 = scan.next();
        Player1 player1 = new Player1(name1);
        System.out.print("あなたの名前を入力してください");
        Scanner scan2 = new Scanner(System.in);
        name2 = scan.next();
        Player2 player2 = new Player2(name2);
        //Order order = new Order("")
        Board ban = new Board();
        ban.boarddisplay(ban.board());

        int turn=0;
        while (!player1.isLose() && player2.isLose()==false){
                turn++;
                System.out.printf("%dターン目です\n",turn);
                player1.put();
                ban.boarddisplay(ban.board());
                player2.put();
                ban.boarddisplay(ban.board());
        }
        System.out.println("試合終了");
        }

}