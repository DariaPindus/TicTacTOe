package ua.od.pindus;

import java.util.Scanner;

/**
 * Created by User on 25.04.2016.
 */
public class Game {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Game is started");

        Board board=new Board();
        board.printBoard();

        while (!board.isFinished()){
            System.out.println("Player "+ board.currentPlayer+ " moves...");
            System.out.print("Enter your move:");
            String move = sc.next();
            if(!board.makeMove(move)){
                System.out.println("Input is incorrect. Repeat your move. ");       //?????как реализовать повтор ввода??????
            }
            board.printBoard();
        }

        System.out.println("The winner is "+ board.returnWinner());
    }
}
