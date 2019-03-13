package jp.ac.uryukyu.ie.Rport6_2;

import java.util.*;

public class Player {

    private boolean position,lose;
    //private int count;
    private String name;
    int x_position,y_position;

    public Player(String name) {
      this.name = name;
    }

    public void put() {
      System.out.print(getName()+"の番です\n");
      System.out.print("置く場所を決めてください\n");
      Scanner scan = new Scanner(System.in);
      try {
          System.out.println("横列");
          x_position = scan.nextInt();
          x_position -= 1;
          if(x_position > 14 || x_position < 0){
            System.out.println("盤の範囲を超えています");
            put();
          }

          System.out.println("縦列");
          y_position = scan.nextInt();
          y_position -= 1;
          if(y_position > 14 || y_position < 0){
            System.out.println("盤の範囲を超えています");
            put();
          }
      }catch (NoSuchElementException e){
          System.out.println("整数を入力してください。");
          put();
      }
    }

    public int getXposition(){
      //xの置く位置
      return x_position;
    }

    public int getYposition(){
      //yの置く位置
      return y_position;
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
