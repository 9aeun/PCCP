package com.pccp._9_트리;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _1_트리 {
    private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    private static int[][] tree;
    public static void main(String[] args) throws IOException {
//        13
//        1 2 1 3 2 4 3 5 3 6 4 7 5 8 5 9 6 10 6 11 7 12 11 13
        int n = Integer.parseInt(reader.readLine());

        String line = reader.readLine();
        StringTokenizer tokens = new StringTokenizer(line);

        // 트리 초기화
        tree = new int[n+1][2]; // n개의 정점만큼 [왼쪽, 오른쪽] 배열을 2차원으로 생성

        for (int node = 0; node < n + 1; node++) {
            tree[node][0] = -1;
            tree[node][1] = -1;

            // tree[node] = new int[] {-1, -1};
        }

        while (tokens.hasMoreTokens()) {
            int parentNode = Integer.parseInt(tokens.nextToken());  // "1" -> 1
            int childNode = Integer.parseInt(tokens.nextToken());   // "2" -> 2

            if (tree[parentNode][0] == -1) {
                tree[parentNode][0] = childNode;
            } else {
                tree[parentNode][1] = childNode;
            }
        }

//        for (int[] temp : tree) {
//            System.out.println(Arrays.toString(temp));
//        }
        preorder(1);
        System.out.println();
        inorder(1);
        System.out.println();
        postorder(1);

    }

    // 1. 전위 순회 (preorder)
    private static void preorder(int node) {
        //Base Case (리프 노드 그 다음이면)
        if (node == -1) {
            return;
        }
        System.out.print(node + " ");   // C 출력(센터)
        preorder(tree[node][0]);    // 왼쪽으로 전위 순회
        preorder(tree[node][1]);    // 오른쪽으로 전위 순회
    }

    // 2. 중위 순회 (inorder)

    private static void inorder(int node) {
        if (node == -1) {
            return;
        }
        inorder(tree[node][0]);
        System.out.print(node + " ");
        inorder(tree[node][1]);
    }

    // 3. 후위 순회 (postorder)
    private static void postorder(int node) {
        if (node == -1) {
            return;
        }
        postorder(tree[node][0]);
        postorder(tree[node][1]);
        System.out.print(node + " ");
    }
}
