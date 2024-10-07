package com.pccp._7_스텍_큐_덱;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class _4_BOJ_제로 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int N = s.nextInt();  // 입력받을 수의 개수
        int result = 0;  // 최종 결과
        Deque<Integer> queue = new ArrayDeque<>();  // 스택(Deque 사용)

        // N개의 수를 입력받아 처리
        for (int i = 0; i < N; i++) {
            int m = s.nextInt();  // 수 입력
            if (m != 0) {
                queue.push(m);  // 0이 아니면 큐에 추가
            } else {
                queue.poll();  // 0이면 마지막 수를 제거
            }
        }

        // 큐에 남아있는 모든 원소를 더함
        while (!queue.isEmpty()) {
            result += queue.poll();  // 큐에서 하나씩 꺼내어 더함
        }

        // 최종 결과 출력
        System.out.println(result);
    }
}
