package com.atul.chessGame.utils;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputsUtil {
    public static int[] takeInputs() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] inputs = br.readLine().split(" ");
        int row = Integer.parseInt(inputs[0]);
        int col = Integer.parseInt(inputs[1]);
        return new int[]{row, col};
    }
}
