package com.pccp._8_그래프;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _7_BOJ_단지번호붙이기 {
    private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    private static int[] dx = {-1, 1, 0, 0};
    private static int[] dy = {0, 0, -1, 1};




    public static void main(String[] args) throws IOException {
        int n = Integer.parseInt(reader.readLine());
        int[][] map = new int[n][n];    // 격차
        boolean[][] visited = new boolean[n][n];    // 2차원 방문 배열

        // map 만들기
        for (int i = 0; i< n; i++){
            String[] tokens = reader.readLine().split("");

            for (int j = 0; j < n; j++) {
                map[i][j] = Integer.parseInt(tokens[j]);
            }

        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if(map[i][j] == 1 && !visited[i][j]) {
                    visited[i][j] = true;   // 출발 지점을 우선 방문 처리 함.
                    dfs(i, j);
                }
            }
        }
    }
    private static void dfs(int x, int y) {
        for (int i = 0; i < 4; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];

            // 범위 확인
            if (0 <= nx && nx < n && 0 <= ny && ny < n && map[nx][ny])
        }
    }
}
