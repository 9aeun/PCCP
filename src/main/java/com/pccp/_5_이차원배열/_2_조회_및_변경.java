package com.pccp._5_이차원배열;

import java.util.Arrays;

public class _2_조회_및_변경 {

    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        System.out.println(matrix[0][0]); // 1
        System.out.println(matrix[2][2]); // 9

        matrix[0][0] = 100; // 변경
        System.out.println(matrix[0][0]); // 100

        System.out.println(Arrays.deepToString(matrix));
    }
}
