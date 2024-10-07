package com.pccp._5_이차원배열;

public class _5_델타탐색 {

    public static void main(String[] args) {
        int n = 3;
        int m = 3;

        int[][] matrix = {
                {3, 7, 9},
                {4, 2, 6},
                {8, 1, 5}
        };

        // 상하좌우 델타값
        int[] dx = {-1, 1, 0, 0};
        int[] dy = {0, 0, -1, 1};

        // 초기위치
        int x = 1;
        int y = 1;

        // 1. 상(위쪽)
        int nx = x + dx[0]; // x - 1
        int ny = y + dy[0]; // y + 0

        // 2. 하(아래쪽)
//        int nx = x + dx[1]; // x + 1
//        int ny = y + dy[1]; // y + 0

        // 3. 좌(왼쪽)
//        int nx = x + dx[2]; // x + 0
//        int ny = y + dy[2]; // y - 1

        // 4. 우(오른쪽)
//        int nx = x + dx[3]; // x + 0
//        int ny = y + dy[3]; // y + 1

        // 이동한 다음에 범위 내에 있는지 유효성 검사 및 갱신
        if (0 <= nx && nx < n && 0 <= ny && ny < m) {
            x = nx;
            y = ny;
        }
    }
}



















