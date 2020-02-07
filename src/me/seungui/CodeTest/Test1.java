package me.seungui.CodeTest;

public class Test1 {

    public static void main(String[] args) {
        int result = solution(456789);
        System.out.println(result);
    }

    public static int solution(int n) {
        String s = Integer.toString(n);
        String[] strArr = s.split("");

        int value = 0;

        for(String str : strArr) {
            value += Integer.parseInt(str);
        }

        int length = (int)(Math.log10(value)+1);

        if(length > 1) {
            value = solution(value);
        }

        return value;
    }
}
