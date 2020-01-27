package me.seungui;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Book> bookList = Arrays.asList(
                new Book("novel1", 10000, "novel"),
                new Book("novel2", 11000, "novel"),
                new Book("novel3", 12000, "novel"),

                new Book("history1", 10000, "history"),
                new Book("history2", 11000, "history"),
                new Book("history3", 12000, "history"),

                new Book("computer1", 10000, "computer"),
                new Book("computer2", 11000, "computer"),
                new Book("computer3", 12000, "computer")
        );

        // BookPredicate인터페이스를 구현하는 별도의 클래스를 만들어 사용
        List<Book> books1 = collectBook(bookList, new BookPricePredicate(12000));
        System.out.println("===============book1===============");
        for(Book book : books1){
            System.out.println(book.toString());
        }
        System.out.println("===============book1===============");
        System.out.println();
        System.out.println();

        List<Book> books2 = collectBook(bookList, new BookTypePredicate("history"));
        System.out.println("===============book2===============");
        for(Book book : books2){
            System.out.println(book.toString());
        }
        System.out.println("===============book2===============");
        System.out.println();
        System.out.println();

        // 익명 클래스 사용
        List<Book> book3 = collectBook(bookList, new BookPredicate() {
            @Override
            public boolean check(Book book) {
                return book.getPrice() > 11000;
            }
        });

        System.out.println("===============book3===============");
        for(Book book : book3) {
            System.out.println(book.toString());
        }
        System.out.println("===============book3===============");
        System.out.println();
        System.out.println();

        List<Book> book4 = collectBook(bookList, new BookPredicate() {
            @Override
            public boolean check(Book book) {
                return "history".equals(book.getType());
            }
        });
        System.out.println("===============book4===============");
        for(Book book : book4) {
            System.out.println(book.toString());
        }
        System.out.println("===============book4===============");
        System.out.println();
        System.out.println();

        // 람다표현식 사용
        List<Book> book5 = collectBook(bookList, (Book book) -> book.getPrice() < 11000);
        System.out.println("===============book5===============");
        for(Book book : book5) {
            System.out.println(book.toString());
        }
        System.out.println("===============book5===============");
        System.out.println();
        System.out.println();

        List<Book> book6 = collectBook(bookList, (Book book) -> "history".equals(book.getType()));
        System.out.println("===============book6===============");
        for(Book book : book6) {
            System.out.println(book.toString());
        }
        System.out.println("===============book6===============");
        System.out.println();
        System.out.println();
    }

    public static List<Book> collectBook(List<Book> bookList, BookPredicate bookPredicate) {
        List<Book> result = new ArrayList<>();
        for (Book book : bookList) {
            if (bookPredicate.check(book)) {
                result.add(book);
            }
        }
        return result;
    }
}
