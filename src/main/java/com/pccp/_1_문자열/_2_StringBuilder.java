package com.pccp._1_문자열;

public class _2_StringBuilder {
    public static void main(String[] args) {
//        String word = "a";
//        System.out.println(word + "b" + "c" + "d"); //immutable이므로 a-> ab-> abc -> abcd 이런식으로 저장되어 메모리 낭비됨
        StringBuilder stringBuilder = new StringBuilder();  //stringBuilder는 class임, mutable임

        stringBuilder.append("a");
        stringBuilder.append("b");  //stringBuilder라는 JVM에 a가 담기고, b가 담김
        System.out.println(stringBuilder.toString());
    }
}
