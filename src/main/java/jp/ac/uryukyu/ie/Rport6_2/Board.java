package jp.ac.uryukyu.ie.Rport6_2;

import java.util.Arrays;

public class Board {
    public static void main(String[] args) {
        int height;
        int width;
        int board_square;
        board_square = 0;
        int[][] ban = new int[14][14];
        for (height = 0; height < 15; height++) {
            for (width = 0; width < 15; width++) {
                ban[height][width] = board_square;
            }
        }
        System.out.print( Arrays.deepToString(ban));
    }
}

