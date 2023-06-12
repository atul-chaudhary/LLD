package com.atul.SnakeAndLaddder.service;

import com.atul.SnakeAndLaddder.modal.Board;
import com.atul.SnakeAndLaddder.modal.Dice;
import com.atul.SnakeAndLaddder.modal.Player;

import java.util.*;

public class SnakesAndLadderService {
    Dice dice;
    Board board;
    List<Player> players;
    Map<Integer, Integer> snakes;
    Map<Integer, Integer> ladder;
    Queue<Player> turns;


    public SnakesAndLadderService(List<Player> players, Map<Integer, Integer> snakes, Map<Integer, Integer> ladder) {
        this.players = players;
        this.snakes = snakes;
        this.ladder = ladder;
        this.board = new Board();
        this.turns = new LinkedList<>(players);
        this.dice = new Dice();
    }

    public void startGame() {
        while (true) {
            Player currentPlayer = turns.poll();
            int cur = currentPlayer.getCurrentPosition();
            int rollDice = rollDice(cur);
            while (cur + rollDice > 100) {
                rollDice = rollDice(cur);
            }

            int newPosition = checkForSnakesOrLadder(cur + rollDice);
            currentPlayer.setCurrentPosition(newPosition);

            System.out.println(currentPlayer.getName() + " rolled a " + rollDice + " and moved from " + cur + " " + newPosition);
            if (currentPlayer.getCurrentPosition() == 100) {
                System.out.println("Player with Name wins " + currentPlayer.getName());
                break;
            }

            turns.offer(currentPlayer);
        }
    }

    private int checkForSnakesOrLadder(int currentPosition) {
        int newPosition = currentPosition;
        if (snakes.containsKey(currentPosition)) {
            newPosition = snakes.get(currentPosition);
        }

        if (ladder.containsKey(currentPosition)) {
            newPosition = ladder.get(currentPosition);
        }

        return newPosition;
    }

    private int rollDice(int currNumber) {
        int start = 1;
        int end = 6;
        return generate(start, end);
    }

    public static int generate(int min, int max) {
        return min + (int) (Math.random() * ((max - min) + 1));
    }

}
