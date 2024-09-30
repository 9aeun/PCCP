package com.pccp._3_정렬;

import java.util.Arrays;
import java.util.Comparator;

public class _4_Comparator {
//    public static void main(String[] args) {
//        String[] words = {"zebra", "hi", "mic", "hell"};
//        Arrays.sort(words, Comparator.naturalOrder());  // 오름차순
//        Arrays.sort(words, Comparator.reverseOrder());  // 내림차순
//
//    }

    public static void main(String[] args) {
        String[] words = {"zebra", "hi", "mic", "hell"};
        MyComparator myComparator = new MyComparator();
        Arrays.sort(words, myComparator);
        System.out.println(Arrays.toString(words));
    }

    static class MyComparator implements Comparator<String> {
        @Override
        public int compare(String o1, String o2) {
            // compare가 1. 음수면 -> 앞이 앞으로,  2. 0 -> 그대로, 3. 양수 -> 앞이 뒤로
            // 반환 값은 위치를 설정해준다고 생각하기
            int length1 = o1.length();
            int length2 = o2.length();

            if(length1 < length2){
                return -1;  // 위치를 -1 시켜
            } else if (length1 > length2) {
                return 1;   // 위치를 +1 시켜
            }
            else {
                return 0;   // 위치 그대로
            }
        }
    }
}
