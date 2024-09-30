package com.pccp._3_정렬;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

public class _2_Collections {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(100);
        numbers.add(-100);
        numbers.add(0);
        numbers.add(1);
        numbers.add(23);

        System.out.println(numbers);    // [100, -100, 0, 1, 23]

        Collections.sort(numbers);
        System.out.println(numbers);    // [-100, 0, 1, 23, 100]

        Collections.sort(numbers, Comparator.reverseOrder());
        System.out.println(numbers);    // [100, 23, 1, 0, -100]

        // list.sort()
        numbers.sort(null);
        numbers.sort(Comparator.naturalOrder());    // numbers를 오름차순 정렬
        numbers.sort(Comparator.reverseOrder());    // numbers를 내림차순 정렬
    }
}
