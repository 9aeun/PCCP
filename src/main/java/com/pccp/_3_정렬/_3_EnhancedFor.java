package com.pccp._3_정렬;

public class _3_EnhancedFor {
    public static void main(String[] args) {
        int[] numbers = {1,2,3,4,5};

        for (int i=0; i<numbers.length; i++) {
            System.out.println(numbers[i]);
        }

        for (int number : numbers) {
            System.out.println(number);
        }
    }
}
