package me.seungui;

public class BookPricePredicate implements BookPredicate {

    private int price;

    public BookPricePredicate(int price) {
        this.price = price;
    }

    @Override
    public boolean check(Book book) {
        return book.getPrice() >= price;
    }
}
