package jp.ac.uryukyu.ie.Rport6_2;

import org.junit.jupiter.api.Test;

import java.util.Scanner;

import static org.junit.Assert.*;

public class Player1Test {

    @Test

    public void put(String name) {
        Board ban = new Board();
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        int num2 = scan.nextInt();
        ban.w_ban(num,num2);
        ban.boarddisplay();
    }


}