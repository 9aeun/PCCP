package com.pccp._6_입출력;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _3_BOJ_2566_최댓값 {

    private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        int n = 9;
        int[][] matrix = new int[n][n];

        for (int i = 0; i < n; i++) {
            String line = reader.readLine();
            String[] tokens = line.split(" ");

            for (int j = 0; j < n; j++) {
                matrix[i][j] = Integer.parseInt(tokens[j]);
            }
        }

        int maxNumber = -1;
        int maxX = 0;
        int maxY = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (matrix[i][j] > maxNumber) {
                    maxNumber = matrix[i][j];
                    maxX = i + 1;
                    maxY = j + 1;
                }
            }
        }

        System.out.println(maxNumber); // 90
        System.out.println(maxX + " " + maxY); // 5 7
    }
}
