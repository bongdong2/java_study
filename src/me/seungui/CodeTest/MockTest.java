package me.seungui.CodeTest;

import java.util.ArrayList;
import java.util.List;

public class MockTest {
    public static void main(String[] args) {

        int[] aaa = { 1, 2, 3, 4, 5};
        //int[] aaa = { 1, 3, 2, 4, 2};
        //int[] aaa = { 1, 2, 3, 4, 5, 1, 2, 3, 4, 5 };

        int[] temp = solution(aaa);
        for(int value : temp) {
            System.out.println(value);
        }
    }

    public static int[] solution(int[] answers) {

        int[] pattern1 = { 1, 2, 3, 4, 5 };
        int[] pattern2 = { 2, 1, 2, 3, 2, 4, 2, 5 };
        int[] pattern3 = { 3, 3, 1, 1 ,2, 2, 4, 4, 5, 5 };

        int[] scores = new int[3];

        for(int i = 0; i < answers.length; i++) {
            if(answers[i] == pattern1[i % 5]) {
                scores[0]++;
            }

            if(answers[i] == pattern2[i % 8]) {
                scores[1]++;
            }

            if(answers[i] == pattern3[i % 10]) {
                scores[2]++;
            }
        }

        int maxValue = scores[0];
        for(int score : scores) {
            if(maxValue < score) maxValue = score;
        }

        List<Integer> scoreList = new ArrayList<>();
        for(int i = 0; i < scores.length; i++) {
            if(scores[i] == maxValue) scoreList.add(i);
        }

        int[] answer = new int[scoreList.size()];
        for(int i = 0; i < scoreList.size(); i++) {
            answer[i] = scoreList.get(i) + 1;
        }
        return answer;
    }
}
