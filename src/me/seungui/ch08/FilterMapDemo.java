package me.seungui.ch08;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FilterMapDemo {

    public static void main(String[] args) throws IOException {
        //String contents = new String(Files.readAllBytes(Paths.get("alice.txt")), StandardCharsets.UTF_8);

        List<String> words = Arrays.asList("Apple", "Banana", "Pear", "Melon");
        Stream<String> someWords = words.stream()
                .filter(w -> w.length() > 4);
        show("someWords", someWords);

        Stream<String> lowercaseWords = words.stream().map(String::toLowerCase);
        show("lowercaseWords", lowercaseWords);

        Stream<String> firstLetters = words.stream().map(s -> s.substring(0, 1)).map(String::toLowerCase);
        show("firstLetters", firstLetters);

        show("letter(boat", letters("boat"));


        String[] song = { "row", "row", "row", "your", "boat", "gently", "down",
                "the", "stream" };


        Stream<Stream<String>> result = Stream.of(song).map(w -> letters(w));
        Stream<String> flatResult = Stream.of(song).flatMap(w -> letters(w));
        show("flatResult", flatResult);
    }

    public static <T> void show(String title, Stream<T> stream) {
        final int SIZE = 10;
        List<T> firstElements = stream.limit(SIZE + 1).collect(Collectors.toList());
        System.out.print(title + ": ");
        if (firstElements.size() <= SIZE)
            System.out.println(firstElements);
        else {
            firstElements.remove(SIZE);
            String out = firstElements.toString();
            System.out.println(out.substring(0, out.length() - 1) + ", ...]");
        }
    }

    public static Stream<String> letters(String s) {
        List<String> result = new ArrayList<>();
        for (int i = 0; i < s.length(); i++)
            result.add(s.substring(i, i + 1));
        return result.stream();
    }
}