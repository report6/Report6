package jp.ac.uryukyu.ie.Rport6_2;

import java.util.Scanner;

public class Player1 extends Player {

    public Player1(String name) {
        super(name);
    }

    public void put(String name){
        System.out.printf("%sの番です", getName());
        System.out.printf("置く場所を決めてください");
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        int num2 = scan.nextInt();
        ban.board()[num][num2]="●";
    }

    public void juge(Player opponent){
        if(isLose()==true){
            System.out.printf("%dの勝利です",opponent.getName());
        }
    }

}
