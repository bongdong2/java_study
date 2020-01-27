package me.seungui.lambda;

@FunctionalInterface
public interface BookPredicate {

    boolean check(Book book);
}
