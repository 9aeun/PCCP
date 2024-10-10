package com.pccp._8_그래프;

public class _4_DFS_재귀 {
    // DFS 메서드가 main과 분리되어 있어서 클래스(전역) 변수로 선언
    private static int[][] graph;
    private static boolean[] visited;

    public static void main(String[] args) {
        int n = 7; // 정점 개수

        // 그래프 - 인접리스트
        graph = new int[][] {
                {1, 2},
                {0, 3, 4},
                {0, 4, 5},
                {1},
                {1, 2, 6},
                {2},
                {4}
        };

        int start = 0; // 시작 정점 - 0번
        visited = new boolean[n]; // 방문 배열 초기화

        dfs(start); // 0 1 3 4 2 5 6
    }

    private static void dfs(int node) {
        visited[node] = true; // 방문
        System.out.print(node + " "); // 방문 시 정점 번호 출력

        // 인접 정점 중 아직 방문하지 않은 정점 탐색 (재귀적으로 끝까지 들어감)
        for (int nextNode : graph[node]) {
            if (!visited[nextNode]) {
                dfs(nextNode);
            }
        }
    }
}
