package com.atul.tic_tac_toe.util;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class InputUtil {

    public static int[] takeInput() throws IOException {
        System.out.print("please enter row and col ");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] inputs = br.readLine().trim().split(" ");
        int first = Integer.parseInt(inputs[0]);
        int second = Integer.parseInt(inputs[1]);
        return new int[]{first, second};
    }
}
