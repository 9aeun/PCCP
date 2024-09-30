package com.pccp._2_컬렉션;

import java.util.HashMap;

public class _5_Map {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>(); // key : String, value : Integer

        // put
        map.put("kyle", 10);    // key, value
        map.put("justin", 20);    // key, value
        map.put("alex", 15);    // key, value
        map.put("alex", 10);    // value 수정도 가능
        System.out.println(map);    // 출력 결과 : {alex=15, kyle=10, justin=20}, 순서 없음, 중복 없음(한 쌍이)
        // 본래 : {alex: 15, kyle: 10, justin: 20}

        // get
        System.out.println(map.get("kyle"));    // 10
        System.out.println(map.get("justin"));  // 20
        System.out.println(map.get("alex"));    // 15
    }
}
