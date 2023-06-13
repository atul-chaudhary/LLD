package com.atul.tic_tac_toe;

import com.atul.tic_tac_toe.model.Piece;
import com.atul.tic_tac_toe.model.Player;
import com.atul.tic_tac_toe.service.TicTacToeService;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;


/**
gav
sag
_ _ _
_ _ _
_ _ _
please enter row and col 0 0
X _ _
_ _ _
_ _ _
please enter row and col 1 0
X _ _
O _ _
_ _ _
please enter row and col 0 1
X X _
O _ _
_ _ _
please enter row and col 1 1
X X _
O O _
_ _ _
please enter row and col 0 2
X X X
O O _
_ _ _
Player with Name gav wins the Game

**/

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String player1Name = br.readLine();
        String player2Name = br.readLine();

        List<Player> players = new ArrayList<>();
        int boardSize = 3;

        Player playerOne = new Player(player1Name, Piece.X);
        players.add(playerOne);

        Player playerTwo = new Player(player2Name, Piece.O);
        players.add(playerTwo);

        TicTacToeService tacToeService = new TicTacToeService(boardSize, players);
        tacToeService.startGame();

    }

}
