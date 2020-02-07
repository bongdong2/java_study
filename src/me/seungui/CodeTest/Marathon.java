package me.seungui.CodeTest;

import java.util.HashMap;
import java.util.Map;

public class Marathon {

    public static void main(String[] args) {

        String[] p = {"mislav", "stanko", "mislav", "ana"};
        String[] c = { "stanko", "ana", "mislav"};

        String result = solution(p, c);
        System.out.println(result);
    }


    public static String solution(String[] participant, String[] completion) {
        String answer = "";
        Map<String, Integer> map = new HashMap<>();
        for (String player : participant)
            map.put(player, map.getOrDefault(player, 0) + 1);
        for (String player : completion)
            map.put(player, map.get(player) - 1);

        for (String key : map.keySet()) {
            if (map.get(key) != 0){
                answer = key;
            }
        }
        return answer;
    }
}