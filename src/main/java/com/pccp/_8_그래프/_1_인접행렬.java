package com.pccp._8_그래프;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class _1_인접행렬 {
    private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        int n = Integer.parseInt(reader.readLine());
        int m = Integer.parseInt(reader.readLine());

        int[][] graph = new int[n][n];

        for (int i = 0; i < m; i++) {
            String[] tokens = reader.readLine().split(" ");
            int v1 = Integer.parseInt(tokens[0]);
            int v2 = Integer.parseInt(tokens[1]);

            // 행렬로 표시해서 둘이 인접해 있기 때문에 양쪽으로 해줘야함
            graph[v1][v2] = 1;
            graph[v2][v1] = 1;
        }

        for (int[] line : graph) {
            System.out.println(Arrays.toString(line));
        }
    }
}
