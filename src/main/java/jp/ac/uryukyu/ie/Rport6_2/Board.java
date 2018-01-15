package jp.ac.uryukyu.ie.Rport6_2;

import java.util.Arrays;
import java.util.Stack;


public class Board {

    /*
        ボードゲームの基礎となる２次元配列を作成
        この関数はreturnで２次元配列を返す
        縦が14行、横が14列
     */
    public static String[][] board() {
        int height, width;
        String board_square = "e";
        String[][] ban = new String[14][14];
        for (height = 0; height < 14; height++) {       //縦のfor文
            for (width = 0; width < 14; width++) {      //横のfor文
                ban[height][width] = board_square;
            }
        }
        return ban;
    }

    /*
        ボードを表示するメソッド
        引数として２次元配列をもらう
        plintメッソドを応用して作成
     */

    public static void boarddisplay(String ban[][]) {
        int y = -1;
        int x = -1;
        //盤面を指定するための配列
        String num[] = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14"};
        for (int i = 0; i < 14; i++) {

            x += 1;
            if (x == 14) {      //xが14の場合13にするする
                x = 13;
            }

            for (int j = 0; j < 14; j++) {

                    // 盤面を指定するためにはString num[]必要なのでここで表示

                if (i == 0 && j == 0) {
                    for (int t = 0; t < 14; t++) {
                        if (t < 13) {
                            //printで"%2s"この機能を使い盤面見やすくした。
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
