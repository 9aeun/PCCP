package com.pccp_1_문자열;

import java.sql.Array;
import java.sql.SQLOutput;
import java.util.Arrays;

public class _1_String {
    public static void main(String[] args){
        String word = "university"; //할당

        // chatAt()
//        char c = word.charAt(0); //word의 0번째 문자 => b // ctrl + alt + v : 변수 만들어줌
//        System.out.println(c);
//
//        System.out.println(word.charAt(1));
//        System.out.println(word.charAt(word.length()-1));

        for (int i = 0; i < word.length(); i++){
            System.out.println(word.charAt(i));
        }

        // while문으로 바꿔서
        // 초기식 -> 조건문 -> 증감식
        int i = 0;
        System.out.println("while문");
        while (i<word.length()) {
            System.out.println(word.charAt(i));
            i+=1;   //i++ 대신 i+=1로 사용하기 (clean code)
        }

        // contains -> boolean , if문이랑 많이 사용
        word = "banana";

        System.out.println(word.contains("n")); // true
        System.out.println(word.contains("nana"));  // true
        System.out.println(word.contains("f")); // false

        // replace
        word = "banana";
        System.out.println(word.replace("a", "c")); // bcncnc
        System.out.println(word.replace("ba", "fff"));
        System.out.println(word.replace("b", ""));  // 특정 문자열을 지우는 것처럼 대체
        System.out.println(word);   // banana => immutable(int, float, double, String, ...의 기본자료형)들은 변경X , 새롭게 (반대 : mutable)

        // split
        String sentence = "hello world !";
        String sentence1 = "banana";
        String[] strings = sentence.split(" "); // 구분자를 기준으로 문자열을 자름
        String[] as = sentence1.split("a");
        System.out.println(Arrays.toString(strings));   // [hello, world, !]
        System.out.println(Arrays.toString(as));    // [b, n, n]

        // join
        String joinedSentence = String.join(" ", strings);
        System.out.println(joinedSentence); // "hello world !"

        // equals
        String a = "banana";
        String b = "banana";
        String c = "apple";

        System.out.println(a.equals(b));    // true
        System.out.println(b.equals(a));    // true
        System.out.println(a.equals(c));    // false
        // == 은 정수비교, String에서 사용하면 X
    }
}
