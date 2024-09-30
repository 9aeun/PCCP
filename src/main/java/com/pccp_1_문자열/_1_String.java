package com.pccp_1_문자열;

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
    }
}
