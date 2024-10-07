package com.pccp._7_스텍_큐_덱;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.Deque;

public class _2_BOJ_스택2 {
    private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        int n = Integer.parseInt(reader.readLine());
        Deque<Integer> stack = new ArrayDeque<>();

        for (int i = 0; i < n; i++) {
            String line = reader.readLine();
            String[] tokens = line.split(" ");
            String command = tokens[0];

            if (command.equals("1")) {
                int x = Integer.parseInt(tokens[1]);    // "3" -> 3
                stack.push(x);
            } else if (command.equals("2")) {
                if (stack.isEmpty()) {
                    System.out.println(-1);
                } else {
                    System.out.println(stack.pop());
                }
            } else if (command.equals("3")) {
                System.out.println(stack.size());
            } else if (command.equals("4")) {
                if (stack.isEmpty())
                    System.out.println(1);
                else
                    System.out.println(0);
            } else {
                if (stack.isEmpty())
                    System.out.println(-1);
                else {
                    System.out.println(stack.peek());
                }
            }
        }
    }
}
