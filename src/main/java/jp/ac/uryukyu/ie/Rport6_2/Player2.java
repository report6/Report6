package jp.ac.uryukyu.ie.Rport6_2;

import java.util.Scanner;

public class Player2 extends Player{

        public Player2 (boolean position,int count,String name){
            super(position,count,name);
        }

        public void main(){
            System.out.printf("あなたの番です");
            System.out.printf("置く場所を決めてください");
            Scanner scan = new Scanner(System.in);
            int num = scan.nextInt();
        }

        public void win(){
            System.out.print("あなたの勝利です");
        }

        public void lose(){
            System.out.print("あなたの負けです");
        }
    }


