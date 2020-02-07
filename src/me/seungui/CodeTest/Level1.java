package me.seungui.CodeTest;

import java.util.Arrays;

public class Level1 {

    public static void main(String[] args) {

        int[][] arr1 = { {1, 2}, {3, 3} };
        int[][] arr2 = { {2, 2}, {1, 3} };

        System.out.println("arr1.length: " + arr1.length);
        System.out.println("arr2.length: " + arr2.length);

        System.out.println("arr1[0].length : " + arr1[0].length);
        System.out.println("arr2[0].length : " + arr2[0].length);

        int[][] answer1 = solution1(arr1, arr2);

        String answer2 = "";
        answer2 = solution2(1);
        System.out.println(answer2);
        answer2 = solution2(2);
        System.out.println(answer2);
    }

    // 행렬의 덧셈
    public static int[][] solution1(int[][] arr1, int[][] arr2) {
        int[][] answer = new int[arr1.length][arr1[0].length];

        for(int i = 0; i < arr1.length; i++) {
            for(int j = 0; j < arr1[0].length; j++) {
                answer[i][j] = arr1[i][j] + arr2[i][j];
            }
        }

        return answer;
    }

    // 홀짝 구하기
    public static String solution2 (int num) {
        String answer = "";

        if(num % 2 == 0) {
            answer = "Even";
        } else {
            answer = "Odd";
        }

        return answer;
    }
}
