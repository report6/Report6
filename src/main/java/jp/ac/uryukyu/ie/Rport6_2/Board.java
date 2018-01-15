package jp.ac.uryukyu.ie.Rport6_2;

import java.util.Arrays;
import java.util.Stack;


public class Board {
    public Board (){//this.board();
    }
    // public static void main(String[] args) {
    public static String[][] board() {
        int height, width;
        String board_square = "e";
        String[][] ban = new String[14][14];
        for (height = 0; height < 14; height++) {
            for (width = 0; width < 14; width++) {
                ban[height][width] = board_square;

            }
        }

        //System.out.print(Arrays.deepToString(ban));
        return ban;
    }

    //change_num(ban);
    //ban[0][4] = "";
    //System.out.print(Arrays.deepToString(ban));
    public static void boarddisplay(String ban[][]) {
        int y = -1;
        int x = -1;
        String abc[] = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N"};
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
                            System.out.print(String.format("%2s",num[t]));
                        } else {
                            System.out.println(String.format("%2s",num[t]));
                        }
                    }
                }
                    y += 1;
                    if (y == 14) {
                        y = 0;
                    }
                    //System.out.print(x);
                    if (j < 13) {
                        System.out.print(String.format("%2s",ban[x][y]));
                    } else {
                        System.out.print(String.format("%2s",ban[x][y]));
                        System.out.println(String.format("%2s",num[i]));

                    }
                }
            }
        }
    }
