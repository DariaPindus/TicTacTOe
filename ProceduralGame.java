package ua.od.pindus;

import java.util.Arrays;

/**
 * Created by User on 25.04.2016.
 */
public class ProceduralGame {

    public static void main(String[] args) {

        char[][] board=new char[3][3];

        char currPlayer='X';
        Arrays.fill(board, ' ');

        while(!finished(board)){
            System.out.println("CDPlayer "+currPlayer+" moves...");
            System.out.println("Enter your move: ");
            String move="12";
            makeMove(move, board);
        }

        char winner = whoIsWinner(board);
    }

    public static char whoIsWinner(char[][] board){
        return 'X';
    }

    public static void makeMove(String m, char[][]board){

    }

    public static boolean finished(char[][] board){
        return false;
    }
}
