package com.pccp._8_그래프;

import java.util.ArrayDeque;
import java.util.Deque;

public class _5_BFS {
    private static int[][] graph;
    private static boolean[] visited;

    public static void main(String[] args) {
        int n = 7; // 정점 개수

        // 그래프 - 인접리스트
        graph = new int[][] {
                {1, 2},     // 0번 정점
                {0, 3, 4},  // 1번 정점
                {0, 4, 5},  // 2번 정점
                {1},        // 3번 정점
                {1, 2, 6},  // 4번 정점
                {2},        // 5번 정점
                {4}         // 6번 정점
        };

        int start = 0; // 시작 정점 - 0번
        visited = new boolean[n];

        bfs(start); // 0 1 2 3 4 5 6
    }

    private static void bfs(int start) {
        visited[start] = true; // 시작 정점 방문 처리

        // 덱 초기화
        Deque<Integer> deque = new ArrayDeque<>();
        deque.offer(start);

        while (!deque.isEmpty()) {
            int node = deque.poll(); // 방문
            System.out.print(node + " "); // 방문 시 정점 번호 출력

            // 인접 정점 중 아직 방문하지 않은 정점들 덱에 삽입
            for (int nextNode : graph[node]) {
                if (!visited[nextNode]) {
                    visited[nextNode] = true; // 방문 처리
                    deque.offer(nextNode);
                }
            }
        }
    }
}
