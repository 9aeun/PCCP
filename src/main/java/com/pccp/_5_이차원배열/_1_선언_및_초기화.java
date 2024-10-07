package com.pccp._5_이차원배열;

public class _1_선언_및_초기화 {

    public static void main(String[] args) {
        int[] array = {1, 2, 3};

        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        System.out.println(matrix[0][0]); // 1
        System.out.println(matrix[2][2]); // 9

        int[] array2 = new int[3]; // 원소가 0으로 초기화 {0, 0, 0}
        int[][] matrix2 = new int[3][3]; // 원소가 0으로 초기화
    }
}
