package com.pccp._8_그래프;

import java.util.ArrayDeque;
import java.util.Deque;

public class _3_DFS {

    public static void main(String[] args) {
        int n = 7; // 정점 개수

        // 그래프 - 인접리스트
        int[][] graph = {
                {1, 2},
                {0, 3, 4},
                {0, 4, 5},
                {1},
                {1, 2, 6},
                {2},
                {4}
        };

        int start = 0; // 시작 정점 - 0번
        boolean[] visited = new boolean[n]; // 방문 배열 초기화
        visited[start] = true;

        Deque<Integer> stack = new ArrayDeque<>();
        stack.push(start); // 시작 정점을 넣어서 초기화

        while (!stack.isEmpty()) {
            int node = stack.pop(); // 방문
            System.out.print(node + " "); // 방문 시 정점 번호 출력

            // 인접 정점 중 아직 방문하지 않은 정점들 스택에 삽입
            for (int nextNode : graph[node]) {
                if (!visited[nextNode]) {
                    visited[nextNode] = true;
                    stack.push(nextNode);
                }
            }
        }

        // 0 2 5 4 6 1 3
    }
}
