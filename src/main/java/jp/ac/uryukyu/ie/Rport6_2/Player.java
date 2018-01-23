package jp.ac.uryukyu.ie.Rport6_2;

import java.util.Scanner;

public class Player {

    private boolean position,lose;
    private int count;
    private String name;
    Board ban = new Board();

    public Player(String name) {
        ban.board();
        this.name = name;
    }

    public void put(String name) {
        this.name = name;
        System.out.printf("%sの番です", name);
        System.out.printf("置く場所を決めてください");
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        int num2 = scan.nextInt();

    }


    public boolean isEmpty() {
        //指定した場所が空かどうか調べる
        return position;
    }

    public void putting(){
        //置いた石を覚える
    }

    public String getName(){
        return name;
    }


    public void setName(String name){
        this.name=name;
    }

    public boolean isLose(){
        return lose;
    }
    
}


