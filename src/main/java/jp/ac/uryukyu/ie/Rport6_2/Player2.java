package jp.ac.uryukyu.ie.Rport6_2;

import java.util.NoSuchElementException;
import java.util.Scanner;
public class Player2 extends Player{
    public Player2(String name) {
        super(name);
    }

    public void put(String name) {
        int x = 0;
        int y = 0;
        System.out.printf("%sの番です\n", getName());
        System.out.printf("置く場所を決めてください\n");
        Scanner scan = new Scanner(System.in);
        try {
            System.out.println("横列");
            x = scan.nextInt();
            System.out.println("縦列");
            y = scan.nextInt();

            ban.w1_ban(x,y);
            //ban.boardinit();
            ban.boarddisplay();

           /* ban.board()[x][y]="◯";/*
            if(!(ban.board()[x][y] =="e")) {
                System.out.print("ここには石を置けません");
            }*/
        }catch (NoSuchElementException e/*InputMismatchException e*/){
            System.out.println("整数を入力してください。");
        }


    }

    public void juge(Player opponent){
        if(isLose()==true){
            System.out.printf("%dの勝利です",opponent.getName());
        }
    }

}


