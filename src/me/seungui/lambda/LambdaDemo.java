package me.seungui.lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Objects;

public class LambdaDemo {

    public static void main(String[] args) {
        String[] friends = { "Peter", "Paul", "Mary" };
        Arrays.sort(friends,
                Comparator.comparingInt(String::length));
        System.out.println(Arrays.toString(friends));
        ArrayList<String> enemies = new ArrayList<>(Arrays.asList("Malfoy", "Crabbe", "Goyle", null));
        enemies.removeIf(Objects::isNull);
        System.out.println(enemies);
    }

}
