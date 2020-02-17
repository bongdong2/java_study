package me.seungui.ch08;

import java.util.Optional;
import java.util.stream.Stream;

public class SimpleReductions {

    public static void main(String[] args) {

        String[] words = { "sara", "supreme", "money", "show" };
        Optional<String> largest = Stream.of(words).max(String::compareToIgnoreCase);
        System.out.println("largest: " + largest.orElse(""));

        Optional<String> startWithS1 = Stream.of(words).filter( s -> s.startsWith("s")).findFirst();
        System.out.println(startWithS1.orElse(""));

        Optional<String> startWithS2 = Stream.of(words).parallel().filter( s -> s.startsWith("s")).findAny();
        System.out.println(startWithS2.orElse(""));

        boolean aWordStartWithS = Stream.of(words).anyMatch(s -> s.startsWith("s"));
        System.out.println("s로 시작하나요? " + aWordStartWithS);
    }
}
