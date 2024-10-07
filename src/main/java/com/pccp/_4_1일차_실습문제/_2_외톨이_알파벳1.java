package com.pccp._4_1일차_실습문제;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;

public class _2_외톨이_알파벳1 {

    public String solution(String input_string) {
        HashSet<Character> aloneAlphabets = new HashSet<>(); // 외톨이 알파벳
        HashSet<Character> previousAlphabets = new HashSet<>(); // 등장한 알파벳

        char last = input_string.charAt(0); // 가장 최근에 등장한 알파벳
        previousAlphabets.add(last);

        for (int i = 1; i < input_string.length(); i++) {
            char current = input_string.charAt(i); // 현재 알파벳

            if (last == current) {
                continue; // 만약 직전과 현재 알파벳이 같으면, 덩어리이므로 그냥 넘어감
            }

            // 만약 덩어리가 아니고, 현재 알파벳이 이미 등장한 적이 있다면,
            if (previousAlphabets.contains(current)) {
                aloneAlphabets.add(current); // 외톨이 알파벳에 합류
            } else { // 덩어리는 아니지만, 현재 알파벳이 처음 등장한다면,
                previousAlphabets.add(current); // 등장한 알파벳에 합류
            }

            last = current; // 현재를 직전으로 갱신
        }

        // 외톨이 알파벳이 없는 경우
        if (aloneAlphabets.isEmpty()) {
            return "N";
        }

        List<Character> result = new ArrayList<>(aloneAlphabets);
        result.sort(Comparator.naturalOrder()); // 알파벳 순 정렬

        StringBuilder stringBuilder = new StringBuilder();

        for (char alphabet : result) {
            stringBuilder.append(alphabet);
        }

        return stringBuilder.toString();
    }
}
