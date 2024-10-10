package com.pccp._9_트리;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class _3_최대힙 {
    public static void main(String[] args) {
        // 최대힙 : 가장 큰 값이 우선순위가 높은 큐
        // 결과 : 100 11 3 1 -1

        Queue<Integer> heap = new PriorityQueue<>(Comparator.reverseOrder());

        heap.offer(1);
        heap.offer(-1);
        heap.offer(11);
        heap.offer(100);
        heap.offer(3);

        System.out.println(heap.poll());
        System.out.println(heap.poll());
        System.out.println(heap.poll());
        System.out.println(heap.poll());
        System.out.println(heap.poll());
    }
}
