package com.pccp._7_스텍_큐_덱;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;

public class _3_BOJ_큐2 {
    private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        int n = Integer.parseInt(reader.readLine());
        Deque<Integer> queue = new ArrayDeque<>(); // 큐
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < n; i++) {
            String line = reader.readLine();
            String[] tokens = line.split(" ");
            String command = tokens[0];

            if (command.equals("push")) {
                int x = Integer.parseInt(tokens[1]);
                queue.offer(x); // enqueue
                continue; // push 할 때는 개행이 추가되면 안되므로 continue
            }

            if (command.equals("pop")) {
                if (queue.isEmpty()) {
                    result.append(-1);
                } else {
                    result.append(queue.poll()); // dequeue
                }
            } else if (command.equals("size")) {
                result.append(queue.size());
            } else if (command.equals("empty")) {
                if (queue.isEmpty()) {
                    result.append(1);
                } else {
                    result.append(0);
                }
            } else if (command.equals("front")) {
                if (queue.isEmpty()) {
                    result.append(-1);
                } else {
                    result.append(queue.peekFirst());// queue.peek();
                }
            } else {
                if (queue.isEmpty()) {
                    result.append(-1);
                } else {
                    result.append(queue.peekLast());
                }
            }

            result.append("\n");
        }

        System.out.println(result);
    }
}
