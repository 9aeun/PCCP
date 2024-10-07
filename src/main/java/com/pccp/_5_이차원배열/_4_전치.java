package com.pccp._5_이차원배열;

import java.util.Arrays;

public class _4_전치 {

    public static void main(String[] args) {
        int n = 3; // 행 크기
        int m = 3; // 열 크기

        int[][] matrix = {
                {3, 7, 9},
                {4, 2, 6},
                {8, 1, 5}
        };

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (i < j) {
                    // swap
                    int temp = matrix[i][j];
                    matrix[i][j] = matrix[j][i];
                    matrix[j][i] = temp;
                }
            }
        }

        for (int[] line : matrix) {
            System.out.println(Arrays.toString(line));
        }
    }
}
