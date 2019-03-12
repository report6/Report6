package jp.ac.uryukyu.ie.Rport6_2;

import java.util.Scanner;
public class Main{

public static void main(String[] args){
        //int x,y=0
        System.out.println("これから五目並べゲームします");
        Scanner scan = new Scanner(System.in);
        Board ban = new Board();

        System.out.println("あなたの名前を入力してください");
        String name1 = scan.next();
        Players player1 = new Players(name1);

        System.out.println("あなたの名前を入力してください");
        String name2 = scan.next();
        Players player2 = new Players(name2);


        ban.boarddisplay();
        int turn=0;

        while (true){//!player1.isLose() && player2.isLose()==false){

                turn++;
                System.out.print(turn+"ターン目です\n");
                player1.put();
                while(ban.w1_ban(player1.getXposition(),player1.getYposition())){
                  player1.put();
                }
                ban.boarddisplay();

                turn++;
                System.out.print(turn+"ターン目です\n");
                player2.put();
                while(ban.w2_ban(player2.getXposition(),player2.getYposition())){
                  player2.put();
                }
                ban.boarddisplay();
        }
        //System.out.println("試合終了");

    }


}
