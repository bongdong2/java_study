package me.seungui.CodeTest;

import java.util.Arrays;

public class PrimeNumber {

    public static void main(String[] args) {
        // 예) -> "123"  >> 1, 2, 3, 12, 13, 21, 23, 31, 33
        // 이 중에서 소수인 수는 1, 2, 3, 13, 23, 31  => 6

        int primeNumberCount = solution("123");
    }

    public static int solution(String numbers) {
        int answer = 0;

        String[] words = numbers.split("");

        // String형 배열을 int형 배열로 변환하는 코드
        int[] nums = Arrays.stream(words).mapToInt(Integer::parseInt).toArray();

        String[] combWords = combination(nums);

        return answer;
    }

    // 넘겨 받은 정수 배열의 요소들을 조합해 문자열 배열을 반환해는 메서드
    public static String[] combination(int[] arr) {
        String[] strArr = {};

        int arrLength = arr.length;
        int sum = 0;

        for(int i = 0; i < arrLength - 1; i++) {
            for(int j = i + 1; j < arrLength; j++) {
                System.out.println(arr[i]);

                // 1, 2, 3, 12, 13, 21, 23, 31, 32
            }
        }

        return strArr;
    }

    // 파라미터로 넘겨진 수가 소수이면 true, 소수가 아니면 false를 리턴하는 메서드
    public static boolean isPrime(int number) {
        boolean result = true;

        for(int i = 2; i < number; i++) {
            if (number % i == 0) {
                result = false;
                break;
            }
        }

        return result;
    }
}
