package by.verghel.Test;

import by.verghel.Lab1.Book;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static org.junit.Assert.assertTrue;

public class Test15 {
    @Test(timeout = 2000)
    public void Task15() throws Exception{
        List<Book> books = new ArrayList<>();
        books.add(new Book("Book 3", "Author 3", 30, 3));
        books.add(new Book("Book 1", "Author 1", 10, 1));
        books.add(new Book("Book 2", "Author 2", 20, 2));

        String[] sortedBooks = {"Book{title='Book 1', author='Author 1', price=10, edition=0, isbn=1}",
                "Book{title='Book 2', author='Author 2', price=20, edition=0, isbn=2}",
                "Book{title='Book 3', author='Author 3', price=30, edition=0, isbn=3}"};

        Collections.sort(books);

        boolean ok = true;
        int i = 0;
        for (Book book : books) {
            if(!book.toString().equals(sortedBooks[i])){
                ok = false;
                break;
            }
            i++;
        }
        assertTrue("Task15 failed", ok);
    }
}
