package me.seungui.CodeTest;

public class Phonebook {

    public static void main(String[] args) {
        String[] phoneBook = { "123", "119", "11999", "5656" };
        System.out.println(solution(phoneBook));
    }

    public static boolean solution(String[] phone_book) {

        for(int i = 0; i < phone_book.length - 1; i++) {
            for(int j = i + 1; j <phone_book.length; j++) {
                if(phone_book[i].startsWith(phone_book[j])) return false;
                if(phone_book[j].startsWith(phone_book[i])) return false;
            }
        }
        return true;
    }
}
