package me.seungui.ch07;

import java.util.*;

public class SetDemo {
    public static void main(String[] args) {
        Set<String> badWords = new HashSet<>();
        badWords.add("fuck");
        badWords.add("c++");
        badWords.add("si");

        String username = "si";

        if(badWords.contains(username.toLowerCase()))
            System.out.println("Please choose a different user name");


        Set<String> contries = new TreeSet<>();
        contries = new TreeSet<>((u, v) ->
                u.equals(v) ? 0
                        : u.equals("USA") ? -1
                        : v.equals("USA") ? 1
                        : u.compareTo(v));
        // USA가 항상 맨 앞에 온다.

        contries.add("Bahrain");
        contries.add("Australia");
        contries.add("USA");
        contries.add("Canada");
        System.out.println(contries);
    }
}
