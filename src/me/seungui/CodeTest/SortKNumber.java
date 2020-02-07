package me.seungui.CodeTest;

import java.util.Arrays;

public class SortKNumber {

    public static void main(String[] args) {
        int[] array = {1, 5, 2, 6, 3, 7, 4};
        int[][] commands = {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};

        int[] answer = solution(array, commands);

        for(int num : answer) {
            System.out.println("--> " + num);
        }
    }

    public static int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];

        for(int i = 0; i < commands.length; i++) {

            //int[] tempArray = Arrays.copyOfRange(array, commands[i][0] - 1, commands[i][1]);
            //Arrays.sort(tempArray);

            int[] tempArray = cutArray(array, commands[i][0], commands[i][1]);
            tempArray = sortArray(tempArray);

            for(int num : tempArray) {
                System.out.println(num);
            }
            System.out.println("");

            answer[i] = tempArray[commands[i][2] - 1];
        }

        return answer;
    }

    public static int[] cutArray(int[] array, int startIndex, int endIndex) {
        int length = endIndex - startIndex + 1;
        int[] result = new int[length];

        int index = 0;
        for(int j = startIndex - 1; j < endIndex; j++) {
            result[index] = array[j];
            ++index;
        }

        return result;
    }

    public static int[] sortArray(int[] arr) {
        for(int i = 0; i < arr.length; i++) {
            for(int j = 0; j < arr.length -i -1; j++) {
                if(arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        return arr;
    }
}
