package me.seungui.CodeTest;

public class Test3 {

    public static void main(String[] args) {
        // "abababab" -> 2
        // "abcabcabd" -> 9

        int cyle = solution("abababab"); // 2가 나와야 한다.
    }

    public static int solution(String s) {
        int answer = 0;

        String pattern = "";

        for(int i = 0; i < s.length(); i++) {
            for(int j = i + 1; j < s.length(); j++) {
                String subString = s.substring(i, j);
            }
        }

        return answer;
    }
}
