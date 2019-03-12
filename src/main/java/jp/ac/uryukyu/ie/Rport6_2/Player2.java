package jp.ac.uryukyu.ie.Rport6_2;

import java.util.NoSuchElementException;
import java.util.Scanner;
public class Player2 extends Player{
    public Player2(String name) {
        super(name);
    }

    public void put(String name,int count){
        //ban.boardinit();
        int x = 0;
        int y = 0;

        System.out.print(getName()+"の番です\n");
        System.out.print("置く場所を決めてください\n");
        Scanner scan = new Scanner(System.in);
        try {
            System.out.println("横列");
            x = scan.nextInt();
            x -= 1;
            if(x > 14){
              System.out.println("盤の範囲を超えています");
              put(name,count);
            }

            System.out.println("縦列");
            y = scan.nextInt();
            y -= 1;
            if(y > 14){
              System.out.println("盤の範囲を超えています");
              put(name,count);
            }

        }catch (NoSuchElementException e/*InputMismatchException e*/){
            System.out.println("整数を入力してください。");
            put(name,count);
        }
        return x,y;
      }
    }
