package com.atul.tic_tac_toe.model;

public class Board {
    Character [][] grid;

    public Board(Character[][] grid) {
        this.grid = grid;
        fillInitialBoard();
    }

    private void fillInitialBoard() {
        int n = grid.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                grid[i][j] = '_';
            }
        }
    }

    public Character[][] getGrid() {
        return grid;
    }

    public void setGrid(Character[][] grid) {
        this.grid = grid;
    }
}
