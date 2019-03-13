package jp.ac.uryukyu.ie.Rport6_2;

import java.util.NoSuchElementException;
import java.util.Scanner;
import java.util.InputMismatchException;

public class Players extends Player {

    public Players(String name) {
        super(name);
        Board board = new Board();
    }


    public void put(){

        System.out.print(getName()+"の番です\n");
        System.out.print("置く場所を決めてください\n");
        Scanner scan = new Scanner(System.in);
        try {

            System.out.println("横列");
            x_position = scan.nextInt();
            x_position -= 1;
            if(x_position > 14 || x_position <= 0){
              System.out.println("盤の範囲を超えています");
              put();
            }

            System.out.println("縦列");
            y_position = scan.nextInt();
            y_position -= 1;
            if(y_position > 14 || y_position <= 0){
              System.out.println("盤の範囲を超えています");
              put();
            }
        }catch (NoSuchElementException e){
            System.out.println("整数を入力してください。");
            put();
        }


    }
/*
    public void juge(Player opponent){
        if(isLose()==true){
            System.out.printf("%dの勝利です",opponent.getName());
        }
    }
        */

    public void win(){}

    public void lose(){} 

}
