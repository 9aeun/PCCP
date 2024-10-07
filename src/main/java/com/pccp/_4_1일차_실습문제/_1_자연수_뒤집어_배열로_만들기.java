package com.pccp._4_1일차_실습문제;

import java.util.ArrayList;
import java.util.List;

public class _1_자연수_뒤집어_배열로_만들기 {

    public int[] solution(long n) {
        List<Integer> numbers = new ArrayList<>();

        while (n > 0) {
            numbers.add((int) (n % 10));
            n /= 10;
        }

        int[] result = new int[numbers.size()];

        for (int i = 0; i < numbers.size(); i++) {
            result[i] = numbers.get(i);
        }

        return result;
    }
}
