package jp.ac.uryukyu.ie.Rport6_2;

import java.util.NoSuchElementException;
import java.util.Scanner;
import java.util.InputMismatchException;

public class Player1 extends Player {

    public Player1(String name) {
        super(name);
    }

    public void put(String name){
        int x = 0;
        int y = 0;
        System.out.printf("%sの番です\n", name);
        System.out.printf("置く場所を決めてください\n");
        Scanner scan = new Scanner(System.in);
        try {
            System.out.println("横列");
            x = scan.nextInt();
            System.out.println("縦列");
            y = scan.nextInt();

            ban.board()[x][y]="●";
            if(!(ban.board()[x][y] =="e")) {
                System.out.print("ここには石を置けません");
            }
        }catch (NoSuchElementException e/*InputMismatchException e*/){
                System.out.println("整数を入力してください。");
        }
    }
/*
    public void juge(Player opponent){
        if(isLose()==true){
            System.out.printf("%dの勝利です",opponent.getName());
        }
    }

        */


}
