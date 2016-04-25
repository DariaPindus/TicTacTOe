package ua.od.pindus;

import java.util.Arrays;

/**
 * Дописать метод isFinished(), returnWinner() и распечатать симпатичненько доску 
 */
public class Board {

    char[][] board = new char[3][3];
    char currentPlayer;     //kto sled hodit

    public Board() {
        for (int i = 0; i < 3; i++) {
            Arrays.fill(board[i], ' ');
        }
        currentPlayer = 'X';
    }

    public void printBoard() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(" " + board[i][j]);
            }
            System.out.println();
        }
    }

    public boolean isFinished() {
        if(board[0][0]=='X'&&board[0][1]=='X'&&board[0][2]=='X')
            return true;
        else
            return false;
    }

    public boolean makeMove(String move) {
        int x = Character.getNumericValue(move.charAt(0));
        int y = Character.getNumericValue(move.charAt(1));

        if (!isMoveValid(x, y)) {
            return false;
        }

        board[x][y] = currentPlayer;
        changeCurrentPlayer();


        return true;
    }

    private void changeCurrentPlayer() {
        if (currentPlayer == 'X')
            currentPlayer = 'O';
        else
            currentPlayer = 'X';
    }

    private boolean isMoveValid(int x, int y) {
        if (x > 2 || y > 2 || x < 0 || y < 0) {
            return false;
        }
        return true;
    }

    public char returnWinner() {
        return 'X';
    }
}
