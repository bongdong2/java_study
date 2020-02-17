package me.seungui.ch08;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CollectingResults {

    public static void main(String[] args) {
        String[] contents = { "lumberjack", "rock on", "food", "for", "all" };
        List<String> wordList = Arrays.asList(contents);
        Stream<String> words = wordList.stream();
        //words.forEach(System.out::println);

        //String[] result = words.toArray(String[]::new);
        /*String[] result = words.toArray(String[]::new);
        for(String r : result) {
            System.out.println(r);
        }*/

        //List<String> myList = words.collect(Collectors.toList());
        //Set<String> mySet = words.collect(Collectors.toSet());
        //TreeSet<String> myTreeSet = words.collect(Collectors.toCollection(TreeSet::new));

        //String myjoining = words.collect(Collectors.joining());
        String seperater = words.collect(Collectors.joining(", "));
        System.out.println(seperater);
    }
}
