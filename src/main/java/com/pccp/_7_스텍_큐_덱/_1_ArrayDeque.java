package com.pccp._7_스텍_큐_덱;

import java.util.*;

public class _1_ArrayDeque {
    public static void main(String[] args) {
//        Stack<Integer> stack = new Stack<>();
//        stack.push(1);
//        stack.pop();

//        Queue<Integer> queue = new LinkedList<>();
//        queue.offer(1);     // enqueue
//        queue.poll();           // dequeue

        Deque<Integer> stack = new ArrayDeque<>();
        stack.push(1);
        stack.pop();

        Deque<Integer> queue = new ArrayDeque<>();
        queue.offer(1);
        queue.poll();
    }
}
