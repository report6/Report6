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
        Player player1 = new Player(name1);

        System.out.println("あなたの名前を入力してください");
        String name2 = scan.next();
        Player player2 = new Player(name2);


        ban.boarddisplay();
        int turn=0;

        while (ban.ban_check_lenght() && ban.ban_check_widht()){//!player1.isLose() && player2.isLose()==false){

                turn++;
                System.out.print(turn+"ターン目です\n");
                player1.put();
                while(ban.w_ban(player1.getXposition(),player1.getYposition(),turn)){
                  player1.put();
                }
                ban.boarddisplay();

                turn++;
                System.out.print(turn+"ターン目です\n");
                player2.put();
                while(ban.w_ban(player2.getXposition(),player2.getYposition(),turn)){
                  player2.put();
                }
                ban.boarddisplay();
        }
        System.out.println("試合終了");

    }


}
