package com.pccp._4_1일차_실습문제;

public class _3_외톨이_알파벳2 {

    public String solution(String input_string) {
        String inputString = "$" + input_string + "$"; // 양 끝 알파벳을 고려해 임의의 기호 추가
        StringBuilder stringBuilder = new StringBuilder();

        // a ~ z 까지 26번 반복하며 외톨이 알파벳을 모두 검사
        for (char alphabet = 'a'; alphabet <= 'z'; alphabet++) {
            // 알파벳이 한 개 이상 등장하는 모든 패턴을 기준으로 덩어리 자르기
            String[] tokens = inputString.split(alphabet + "+");

            if (tokens.length >= 3) {
                stringBuilder.append(alphabet);
            }
        }

        String result = stringBuilder.toString();

        return result.isEmpty() ? "N" : result;
    }
}
