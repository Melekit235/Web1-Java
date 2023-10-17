package by.verghel.Test;

import by.verghel.Lab1.Book;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class Test12 {
    @Test(timeout = 2000)
    public void Task12() throws Exception{
        boolean ok = true;

        Book book1 = new Book("Masa","Akunin", 100,1);
        Book book2 = new Book("Harry","Roulling", 150,2);
        Book book3 = new Book("Masa","Akunin", 100,3);


        if(book1.hashCode() != 883041178 ||
                book1.equals(book2) ||
                !book1.equals(book3) ||
                !book3.toString().equals("Book{title='Masa', author='Akunin', price=100, edition=0, isbn=3}")
        ){
            ok = false;
        }

        assertTrue("Task12 failed", ok);
    }
}
