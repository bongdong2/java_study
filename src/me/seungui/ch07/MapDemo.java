package me.seungui.ch07;

import java.util.HashMap;
import java.util.Map;

public class MapDemo {
    public static void main(String[] args) {
        Map<Integer, String> books = new HashMap<>();
        books.put(1, "Little Women");
        System.out.println(books.get(1));

        String deault = books.getOrDefault(0, "Alice");
        System.out.println(deault);

        Map<String, Integer> counts = new HashMap<>();
        counts.put("James", 1);
        counts.put("Fred", 2);
        counts.put("Sanchez", 3);

        int count = counts.getOrDefault("Owen", 0);
        System.out.println(count);

        String word = "Fred";
        counts.merge(word, 1, Integer::sum);
        counts.merge(word, 1, Integer::sum);
        System.out.println(counts.get(word));

        for (Map.Entry<String, Integer> entry : counts.entrySet()) {
            String key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println("key : " + key + ", value : " + value);
            //process(key, value);
        }

        counts.forEach((k, v) -> process(k, v));
    }

    public static void process(String key, Integer value) {
        System.out.printf("Processing key %s and value %d\n", key, value);
    }
}
