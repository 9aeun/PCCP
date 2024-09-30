package com.pccp._3_정렬;

import java.util.Arrays;
import java.util.Comparator;

public class _1_Arrays {
    public static void main(String[] args) {
        Integer[] numbers = {1, 0, -10, 213, -111, 25};
//        Arrays.sort(numbers);
        Arrays.sort(numbers, Comparator.reverseOrder());    // int는 기본자료형이라 오류남
        System.out.println(Arrays.toString(numbers));
    }
}
