package com.pccp._6_입출력;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class _1_BufferedReader {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        // 1. 숫자 하나 입력받기
//        int n = Integer.parseInt(reader.readLine());
//        System.out.println(n);

        // 2. 숫자 두개 입력받기 (세로)
        /*
        1
        2
         */
//        int a = Integer.parseInt(reader.readLine());
//        int b = Integer.parseInt(reader.readLine());
//        System.out.println(a);
//        System.out.println(b);

        // 3. 숫자 두개 입력받기 (가로)
        // 1 2
//        String line = reader.readLine();
//        String[] tokens = line.split(" "); // ["1", "2"]
//        int a = Integer.parseInt(tokens[0]); // 1
//        int b = Integer.parseInt(tokens[1]); // 2
//
//        System.out.println(a);
//        System.out.println(b);

        // 4. 일차원 배열 입력받기
        /*
        5
        1 2 3 4 5
         */
//        int n = Integer.parseInt(reader.readLine()); // 5
//        String line = reader.readLine(); // "1 2 3 4 5"
//        String[] tokens = line.split(" "); // ["1", "2", "3", "4", "5"]
//
//        int[] numbers = new int[n]; // [0, 0, 0, 0, 0]
//
//        for (int i = 0; i < n; i++) {
//            numbers[i] = Integer.parseInt(tokens[i]);
//        }
//
//        System.out.println(n);
//        System.out.println(Arrays.toString(numbers));

        // 5. 일차원 배열 입력받기 with StringTokenizer
        /*
        5
        1 2 3 4 5
         */
        int n = Integer.parseInt(reader.readLine());
        int[] numbers = new int[n];

        String line = reader.readLine();
//        String[] tokens = line.split(" ");
        StringTokenizer tokens = new StringTokenizer(line); // 공백을 기준으로 나눠줘요

        for (int i = 0; i < n; i++) {
            numbers[i] = Integer.parseInt(tokens.nextToken());
        }

        System.out.println(n);
        System.out.println(Arrays.toString(numbers));
    }
}

















