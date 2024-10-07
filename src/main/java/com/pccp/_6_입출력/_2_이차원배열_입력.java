package com.pccp._6_입출력;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class _2_이차원배열_입력 {

    private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        /*
        3
        1 2 3
        4 5 6
        7 8 9
         */

//        int n = Integer.parseInt(reader.readLine()); // 이차원배열의 크기 (행 == 열)
//        int[][] matrix = new int[n][n];
//
//        for (int i = 0; i < n; i++) {
//            String line = reader.readLine();
//            String[] tokens = line.split(" "); // ["1", "2", "3"]
//
//            for (int j = 0; j < n; j++) {
//                matrix[i][j] = Integer.parseInt(tokens[j]);
//            }
//        }
//
//        System.out.println(Arrays.deepToString(matrix));

        /*
        3 4
        1 2 3 4
        5 6 7 8
        9 0 1 2
         */

        String line = reader.readLine(); // "3 4"
        String[] tokens = line.split(" "); // ["3", "4"]
        int n = Integer.parseInt(tokens[0]); // 3
        int m = Integer.parseInt(tokens[1]); // 4

        int[][] matrix = new int[n][m];

        for (int i = 0; i < n; i++) {
            line = reader.readLine(); // "1 2 3 4"
            tokens = line.split(" "); // ["1", "2", "3", "4"]

            for (int j = 0; j < m; j++) {
                matrix[i][j] = Integer.parseInt(tokens[j]);
            }
        }
    }
}













