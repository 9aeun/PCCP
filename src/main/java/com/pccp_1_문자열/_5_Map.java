package com.pccp_1_문자열;

import java.util.HashMap;

public class _5_Map {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>(); // key : String, value : Integer

        // put
        map.put("kyle", 10);    // key, value
        map.put("justin", 20);    // key, value
        map.put("alex", 15);    // key, value
        System.out.println(map);    // 출력 결과 : {alex=15, kyle=10, justin=20}, 순서 없음, 중복 없음(한 쌍이)
        // 본래 : {alex: 15, kyle: 10, justin: 20}
        // get
    }
}
