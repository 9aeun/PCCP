package com.pccp._8_그래프;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class _7_BOJ_단지번호붙이기 {
    private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    private static int[] dx = {-1, 1, 0, 0};
    private static int[] dy = {0, 0, -1, 1};

    private static int n;
    private static int[][] map;
    private static boolean[][] visited;
    private static int count;

    public static void main(String[] args) throws IOException {
        n = Integer.parseInt(reader.readLine());
        map = new int[n][n]; // 격자
        visited = new boolean[n][n]; // 2차원 방문 배열

        // map을 만들기
        for (int i = 0; i < n; i++) {
            String[] tokens = reader.readLine().split(""); // ["0", "1", "1" ...]

            for (int j = 0; j < n; j++) {
                map[i][j] = Integer.parseInt(tokens[j]);
            }
        }

        List<Integer> result = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (map[i][j] == 1 && !visited[i][j]) {
                    // dfs/bfs를 출발
                    count = 1;
                    visited[i][j] = true;
                    dfs(i, j);
                    result.add(count);
                }
            }
        }

        System.out.println(result.size()); // 3

        result.sort(Comparator.naturalOrder()); // 오름차순 정렬

        for (int count : result) {
            System.out.println(count);
        }
    }

    private static void dfs(int x, int y) {
        for (int i = 0; i < 4; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];

            // 범위 확인 && 집인지 확인 && 아직 방문하지 않았는지 확인
            if (0 <= nx && nx < n && 0 <= ny && ny < n && map[nx][ny] == 1 && !visited[nx][ny]) {
                visited[nx][ny] = true;
                count += 1;
                dfs(nx, ny);
            }
        }
    }
}
