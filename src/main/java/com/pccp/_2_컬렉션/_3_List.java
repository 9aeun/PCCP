package com.pccp._2_컬렉션;

import java.util.ArrayList;

public class _3_List {
    public static void main(String[] args) {
        // ArrayList
        ArrayList<Integer> list = new ArrayList<>();    //int : 기본 자료형(null X), Integer : 참조 자료형(객체, null 허용)
//        ArrayList<Long> list = new ArrayList<>();
//        ArrayList<Double> list = new ArrayList<>();
//        ArrayList<Boolean> list = new ArrayList<>();
//        ArrayList<String> list = new ArrayList<>();
        // add
        list.add(1);
        list.add(2);

        // get
        System.out.println(list.get(0));    // 1
        System.out.println(list.get(1));    // 2

    }
}
