package me.seungui.CodeTest;

public class PrimeNumber2 {

    public static void main(String[] args) {

        int num = solution(120);
        System.out.println(num);
    }

    public static int solution(int n) {

        int answer = 0;
        int[] arr = new int[n + 1];

        for (int i = 2; i <= n; i++) {
            arr[i] = i;
        }

        for (int i = 2; i * i <= n; i++) {
            int multiplier = 2;
            if (arr[i] == 0) {
                continue;
            }

            for (int j = i; j <= n; ) {
                if (j * multiplier > n) {
                    break;
                }
                arr[j * multiplier] = 0;
                multiplier++;
            }
        }

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != 0) {
                answer++;
            }
        }
        return answer;
    }
}
