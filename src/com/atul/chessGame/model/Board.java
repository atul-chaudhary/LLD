package com.atul.chessGame.model;

public class Board {
    Cell[][] board;

    public Board(Cell[][] board) {
        this.board = board;
    }

    public Cell[][] getBoard() {
        return board;
    }

    public void setBoard(Cell[][] board) {
        this.board = board;
    }
}
