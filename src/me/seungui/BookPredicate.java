package me.seungui;

@FunctionalInterface
public interface BookPredicate {

    boolean check(Book book);
}
