package com.pccp_1_문자열;

import java.util.HashSet;

public class _4_Set {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();

        // add
        set.add(1);
        set.add(2);
        set.add(1); //중복이 제거 됨

        System.out.println(set);    // [1, 2]

        // contains
        // list도 contains가 있고, set도 contains가 있음
        // list는 배열, set은 집합(중복 허용 X)
        System.out.println(set.contains(1));    // true
    }
}
