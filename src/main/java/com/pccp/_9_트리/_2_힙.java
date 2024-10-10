package com.pccp._9_트리;

import java.util.PriorityQueue;
import java.util.Queue;

public class _2_힙 {
    public static void main(String[] args) {
        // 가장 작은 값이 우선순위가 높음
        // 결과 : -1 1 3 11 100
        Queue<Integer> heap = new PriorityQueue<>();

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
