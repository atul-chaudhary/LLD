package com.atul.chessGame.service.movement;

public abstract class PieceMovement {
    public abstract void move(int cur_row, int cur_col, int to_row, int to_cols);
}
