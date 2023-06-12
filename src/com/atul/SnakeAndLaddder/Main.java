package com.atul.SnakeAndLaddder;


import com.atul.SnakeAndLaddder.modal.Player;
import com.atul.SnakeAndLaddder.service.SnakesAndLadderService;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {

        Map<Integer, Integer> snakes = new HashMap<>();
        Map<Integer, Integer> ladder = new HashMap<>();
        List<Player> players = new ArrayList<>();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int numberOfSnakes = Integer.parseInt(br.readLine());
        for (int i = 0; i < numberOfSnakes; i++) {
            String[] temp_jumps = br.readLine().split(" ");
            int start = Integer.parseInt(temp_jumps[0]);
            int end = Integer.parseInt(temp_jumps[1]);
            snakes.put(start, end);
        }

        int numberOfLadders = Integer.parseInt(br.readLine());
        for (int i = 0; i < numberOfLadders; i++) {
            String[] temp_jumps = br.readLine().split(" ");
            int start = Integer.parseInt(temp_jumps[0]);
            int end = Integer.parseInt(temp_jumps[1]);
            ladder.put(start, end);

        }

        int numberOfPlayer = Integer.parseInt(br.readLine());
        for (int i = 0; i < numberOfPlayer; i++) {
            String name = br.readLine();
            players.add(new Player(name, 1));
        }

        SnakesAndLadderService snakesAndLadderService = new SnakesAndLadderService(players, snakes, ladder);
        snakesAndLadderService.startGame();

    }

}
