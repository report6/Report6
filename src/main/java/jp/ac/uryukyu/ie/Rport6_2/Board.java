package jp.ac.uryukyu.ie.Rport6_2;

import java.util.Arrays;

public class Board {
    
    public static void main(String[] args) {
        int height, width;
        int board_square = 0;
        int[][] ban = new int[14][14];
        for (height = 0; height < 14; height++) {
            for (width = 0; width < 14; width++) {
                ban[height][width] = board_square;
                //System.out.print(Arrays.deepToString(ban));
            }
        }
        //change_num(ban);
        ban[0][4] = 7;
        //System.out.print(Arrays.deepToString(ban));
        int y = -1;
        int x = -1;

        for(int i = 0; i<14; i++){
            y+=1;
            if(y==14){
                y=13;
            }
            //System.out.print(y);
            for(int j = 0; j<14; j++){

                x += 1;
                if(x==14){
                    x=0;
                }
                //System.out.print(x);
                if(j<13) {
                    System.out.print(ban[y][x]);
                }else{System.out.println(ban[y][x]);
                }
            }
        }


    }
}

