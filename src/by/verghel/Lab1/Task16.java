package by.verghel.Lab1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Task16 {
    public static void main(String[] args) {
        List<Book> books = new ArrayList<>();
        books.add(new Book("C", "A", 30, 3));
        books.add(new Book("A", "C", 10,2));
        books.add(new Book("B", "B", 20,1));

        System.out.println("Сортировка по названию:");
        Collections.sort(books, new Book.TitleComparator());
        for (Book book : books) {
            System.out.println(book.toString());
        }

        System.out.println("\nСортировка по названию, а затем по автору:");
        Collections.sort(books, new Book.TitleAuthorComparator());
        for (Book book : books) {
            System.out.println(book.toString());
        }

        System.out.println("\nСортировка по автору, а затем по названию:");
        Collections.sort(books, new Book.AuthorTitleComparator());
        for (Book book : books) {
            System.out.println(book.toString());
        }

        System.out.println("\nСортировка по автору, названию и цене:");
        Collections.sort(books, new Book.AuthorTitlePriceComparator());
        for (Book book : books) {
            System.out.println(book.toString());
        }
    }
}
