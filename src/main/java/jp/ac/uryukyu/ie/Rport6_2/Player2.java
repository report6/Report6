package jp.ac.uryukyu.ie.Rport6_2;

import java.util.Scanner;

public class Player2 extends Player {

    public Player2(String name) {
        super(name);
    }

    public void put() {
        System.out.printf("%sの番です\n", getName());
        System.out.printf("置く場所を決めてください\n");
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        int num2 = scan.nextInt();
        ban.board()[num][num2] = "◯";
        if(!(ban.board()[num][num2] =="e")){
            System.out.print("ここには石を置けません");
        }


    }

    public void juge(Player opponent){
        if(isLose()==true){
            System.out.printf("%dの勝利です",opponent.getName());
        }
    }

}


