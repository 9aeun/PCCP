package com.pccp._5_이차원배열;

public class _3_순회 {

    public static void main(String[] args) {
        int n = 3; // 행 크기
        int m = 3; // 열 크기

        int[][] matrix = {
                {3, 7, 9},
                {4, 2, 6},
                {8, 1, 5}
        };

        // 1. 행순회
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(matrix[i][j]);
            }
            System.out.println();
        }

        // 2. 열순회
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrix[j][i]);
            }
            System.out.println();
        }
    }
}
