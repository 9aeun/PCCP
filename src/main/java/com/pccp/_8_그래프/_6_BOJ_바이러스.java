package com.pccp._8_그래프;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class _6_BOJ_바이러스 {
    private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    private static List<List<Integer>> graph;
    private static boolean[] visited;

    public static void main(String[] args) throws IOException {
        int n = Integer.parseInt(reader.readLine()); // 컴퓨터의 개수 (정점 개수)
        int m = Integer.parseInt(reader.readLine()); // 네트워크의 개수 (간선 개수)

        graph = new ArrayList<>();

        for (int i = 0; i < n + 1; i++) {
            graph.add(new ArrayList<>()); // 그래프 초기화 (인접 리스트 초기화)
        }

        visited = new boolean[n + 1]; // 1번 정점부터 시작하므로 n + 1

        for (int i = 0; i < m; i++) {
            String[] tokens = reader.readLine().split(" ");
            int v1 = Integer.parseInt(tokens[0]); // 컴퓨터 1
            int v2 = Integer.parseInt(tokens[1]); // 컴퓨터 2

            // 양방향 연결
            graph.get(v1).add(v2);
            graph.get(v2).add(v1);
        }

        dfs(1);

        int result = 0;

        for (boolean infected : visited) {
            if (infected) {
                result += 1;
            }
        }

        System.out.println(result - 1);
    }

    private static void dfs(int node) {
        visited[node] = true;

        for (int nextNode : graph.get(node)) {
            if (!visited[nextNode]) {
                dfs(nextNode);
            }
        }
    }
}
