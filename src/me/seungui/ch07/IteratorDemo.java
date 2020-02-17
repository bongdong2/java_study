package me.seungui.ch07;

import java.util.*;

public class IteratorDemo {

    public static void main(String[] args) {
        Collection<String> coll = new ArrayList<>();
        coll.add("show");
        coll.add("my");
        coll.add("words");
        Iterator<String> iter = coll.iterator();

        /*while (iter.hasNext()) {
            String element = iter.next();
            System.out.println(element);
        }

        for(String word : coll) {
            System.out.println(word);
        }*/

        /*coll.removeIf(s -> s.equals("show"));
        for(String words : coll) {
            System.out.println(words);
        }

        while(iter.hasNext()) {
            String element = iter.next();
            if(element.equals("show")) {
                iter.remove();
            }
        }

        for(String words : coll) {
            System.out.println(words);
        }*/

        List<String> friends = new LinkedList<>();
        friends.add("Jwa");
        friends.add("Go");
        friends.add("Bu");
        ListIterator<String> listIterator = friends.listIterator();
        listIterator.add("Baker");
        listIterator.add("Bong");
        listIterator.add("Dong");

        for(String friend : friends) {
            System.out.println(friend);
        }
    }
}
