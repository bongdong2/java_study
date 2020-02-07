package me.seungui.CodeTest;

import java.util.Arrays;
import java.util.Collections;

public class Test2 {

    public static void main(String[] args) {
        int[] arr = { 3, 5, 9, 13, 14, 15, 16, 23, 55, 100, 123 };
        int n = 123;
        boolean result = solution(arr, n);
        System.out.println(result);
    }

    public static boolean solution(int[] arr, int n) {
        boolean answer = false;
        int arrLength = arr.length;
        int sum;

        for(int i = 0; i < arrLength - 1; i++) {
            for(int j = i + 1; j < arrLength; j++) {
                sum = arr[i] + arr[j];

                // 두 수의 합이 n과 같으면
                if(sum == n) {
                    return true;
                }
            }
        }

        return answer;
    }
}