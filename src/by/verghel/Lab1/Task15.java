package by.verghel.Lab1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Task15 {
    public static void main(String[] args) {
        List<Book> books = new ArrayList<>();
        books.add(new Book("Book 3", "Author 3", 30, 3));
        books.add(new Book("Book 1", "Author 1", 10, 1));
        books.add(new Book("Book 2", "Author 2", 20, 2));

        Collections.sort(books);

        for (Book book : books) {
            System.out.println(book.toString());
        }
    }
}
