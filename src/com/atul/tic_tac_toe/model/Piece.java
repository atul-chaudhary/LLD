package com.atul.tic_tac_toe.model;

public enum Piece {
    X('X'),
    O('O');

    private char pieceName;

    Piece(char pieceName) {
        this.pieceName = pieceName;
    }

    public char getPieceName() {
        return this.pieceName;
    }
}
