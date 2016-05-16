package ua.od.pindus;

import java.util.Scanner;

/**
 * Created by User on 25.04.2016.
 */
public class Game {

    public static void main(String[] args) {

        Statistics statistics = new Statistics();

        Scanner console = new Scanner(System.in);

        Player playerX = new Human("Ivanov", "Ivan", "Petrovich", 25, 'X');
        Player playerO = new AI("Petrov", "Petr", "Petrovich", 35, 'O');

        String input = console.next();
        while (!input.equals("exit")) {

            System.out.println("Game started...");


            Board board = new Board(playerX, playerO);
            board.printBoard();

            while (!board.gameFinished()) {
                GameProcedure(board);
            }

            System.out.println("The winner is " + board.calculateWinner());
            System.out.println();

            GameResult resultWinner = new GameResult(board.calculateWinner(), "won");
            GameResult resultLoser = new GameResult(board.calculateLoser(), "lost");
            statistics.addResult(resultWinner);
            statistics.addResult(resultLoser);
            input = console.next();
        }

        statistics.showWins(playerX, playerO);
        statistics.showLosses(playerX, playerO);
        statistics.resultsForDay();
    }

    private static void GameProcedure(Board board) {

        Scanner console = new Scanner(System.in);
        System.out.println("Player " + board.currentPlayer + " moves...");
        System.out.print("Enter your move: ");
        String move = console.next();
        if (!board.makeMove(move)) {
            System.out.println("Input was incorrect. Repeat your move.");
        }

        board.printBoard();
    }
}
