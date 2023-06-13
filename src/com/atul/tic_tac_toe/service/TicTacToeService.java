package com.atul.tic_tac_toe.service;

import com.atul.tic_tac_toe.model.Board;
import com.atul.tic_tac_toe.model.Piece;
import com.atul.tic_tac_toe.model.Player;
import com.atul.tic_tac_toe.util.InputUtil;

import java.io.IOException;
import java.util.*;

public class TicTacToeService {
    List<Player> players;
    Queue<Player> turns;
    Board board;


    public TicTacToeService(int boardSize, List<Player> players) {
        this.players = players;
        this.turns = new LinkedList<>(players);
        this.board = new Board(new Character[boardSize][boardSize]);
    }

    public void startGame() throws IOException {
        Character[][] boardGrid = board.getGrid();
        printBoard();
        while (true) {
            Player currentPlayer = turns.poll();

            //check if all board is filled
            if (isAllBoardFilled()) {
                System.out.println("Game Draw");
                break;
            }

            int[] inputs = InputUtil.takeInput();
            boolean isInValid = checkForInValidInput(inputs[0], inputs[1]);
            while (isInValid) {
                System.out.println("Invalid Inputs Please Provide Input again");
                inputs = InputUtil.takeInput();
                isInValid = checkForInValidInput(inputs[0], inputs[1]);
            }
            boardGrid[inputs[0]][inputs[1]] = currentPlayer.getPiece().getPieceName();
            printBoard();
            if (checkForWinner(currentPlayer)) {
                System.out.println("Player with Name " + currentPlayer.getName() + " wins the Game");
                break;
            }

            turns.offer(currentPlayer);
        }
    }

    private boolean isAllBoardFilled() {
        Character[][] boardGrid = board.getGrid();
        int n = boardGrid.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (boardGrid[i][j] != null) {
                    return false;
                }
            }
        }
        return true;
    }

    private boolean checkForWinner(Player currentPlayer) {
        Character[][] boardGrid = board.getGrid();
        int n = boardGrid.length;

        //check row wise
        for (int i = 0; i < n; i++) {
            int count = 0;
            for (int j = 0; j < n; j++) {
                if (boardGrid[i][j] == currentPlayer.getPiece().getPieceName()) {
                    count++;
                }
            }
            if (count == n) {
                return true;
            }
        }

        //check col wise
        for (int j = 0; j < n; j++) {
            int count = 0;

            for (int i = 0; i < n; i++) {
                if (boardGrid[i][j] == currentPlayer.getPiece().getPieceName()) {
                    count++;
                }
            }
            if (count == n) {
                return true;
            }
        }

        //check for dia 1;
        int dia = 0;
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (boardGrid[i][dia++] == currentPlayer.getPiece().getPieceName()) {
                count++;
            }
        }

        if (count == n) {
            return true;
        }

        //check for dia 2;
        dia = n - 1;
        count = 0;
        for (int i = 0; i < n; i++) {
            if (boardGrid[i][dia--] == currentPlayer.getPiece().getPieceName()) {
                count++;
            }
        }

        if (count == n) {
            return true;
        }

        return false;
    }

    private boolean checkForInValidInput(int row, int col) {
        Character[][] boardGrid = board.getGrid();
        if (boardGrid[row][col] == Piece.X.getPieceName() || boardGrid[row][col] == Piece.O.getPieceName()) {
            return true;
        }
        return false;
    }

    private void printBoard() {
        Character[][] boardGrid = board.getGrid();
        int n = boardGrid.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(boardGrid[i][j] + " ");
            }
            System.out.println();
        }
    }

}
