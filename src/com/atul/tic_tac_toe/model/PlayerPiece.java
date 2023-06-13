package com.atul.tic_tac_toe.model;

public class PlayerPiece {
    Piece piece;

    public PlayerPiece(Piece piece) {
        this.piece = piece;
    }

    public Piece getPiece() {
        return piece;
    }

    public void setPiece(Piece piece) {
        this.piece = piece;
    }
}
