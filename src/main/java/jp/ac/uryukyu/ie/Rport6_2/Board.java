package jp.ac.uryukyu.ie.Rport6_2;

import java.util.Arrays;
import java.util.Stack;
import java.util.Scanner;


public class Board {
    private boolean Judgment1;
    private boolean Judgment2;
    private boolean position;
    String ban[][];
    //Player player = new Player();

    public Board (){//this.board();
        board();
    }
    // public static void main(String[] args) {
    public void board() {
        int height, width;
        String board_square = "+";
        ban = new String[14][14];
        for (height = 0; height < 14; height++) {
            for (width = 0; width < 14; width++) {
                ban[height][width] = board_square;

            }
        }
    }

    /**
     * @param x
     * @param y
     */
    //Player1 player1 = new Player1();
    public boolean w_ban(int x, int y, int count){
      if(ban[x][y]=="+"){
        if(count%2==0){
          ban[x][y] = "◯";
          position = false;
        }else{
          ban[x][y] = "●";
          position = false;
        }
      }else{
        System.out.println("ここはすでに打たられています");
        position = true;
      }
      return position;
    }

    public boolean ban_check_lenght(){
      Judgment1 = true;
      exit: for(int i=0; i < 14; i++){
        int count1=0;
        int count2=0;
        for(int j=0; j < 14; j++){
          if(ban[i][j]=="◯"){
            count1++;
            count2=0;
            if(count1 == 5){
              Judgment1 = false;
              break exit;
            }
          }else if(ban[i][j]=="●"){
            count2++;
            count1=0;
            if(count2==5){
              Judgment1 = false;
              break exit;
            }
          }else{
            count1=0;
            count2=0;
          }
        }
      }
      return Judgment1;
    }

    public boolean ban_check_widht(){
      Judgment2 = true;
      exit: for(int i=0; i < 14; i++){
        int count1=0;
        int count2=0;
        for(int j=0; j < 14; j++){
          if(ban[j][i]=="●"){
            count1++;
            count2=0;
            if(count1 == 5){
              Judgment2 = false;
              break exit;
            }
          }else if(ban[j][i]=="◯"){
            count2++;
            count1=0;
            if(count2 == 5){
              Judgment2 = false;
              break exit;
            }
          }else{
            count1=0;
            count2=0;
          }
        }
      }
      return Judgment2;
    }


    //change_num(ban);
    //ban[0][4] = "";
    //System.out.print(Arrays.deepToString(ban));
    public  void boarddisplay() {
        int y = -1;
        int x = -1;
        //String abc[] = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N"};
        String num[] = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14"};
        for (int i = 0; i < 14; i++) {

            x += 1;
            if (x == 14) {
                x = 13;
            }
            //System.out.print(y);
            for (int j = 0; j < 14; j++) {
                if (i == 0 && j == 0) {
                    for (int t = 0; t < 14; t++) {
                        if (t < 13) {
                            System.out.print(String.format("%3s",num[t]));
                        } else {
                            System.out.println(String.format("%3s",num[t]));
                        }
                    }
                }
                y += 1;
                if (y == 14) {
                    y = 0;
                }
                //System.out.print(x);
                if (j < 13) {
                    System.out.print(String.format("%3s",ban[x][y]));
                } else {
                    System.out.print(String.format("%3s",ban[x][y]));
                    System.out.println(String.format("%3s",num[i]));

                }
            }
        }
    }


}
