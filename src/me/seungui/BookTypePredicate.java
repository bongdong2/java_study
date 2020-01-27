package me.seungui;

public class BookTypePredicate implements BookPredicate {

    private String type;

    public BookTypePredicate(String type) {
        this.type = type;
    }

    @Override
    public boolean check(Book book) {
        return book.getType().equals(type);
    }
}
