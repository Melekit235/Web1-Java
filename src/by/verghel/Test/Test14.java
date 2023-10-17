package by.verghel.Test;

import by.verghel.Lab1.Book;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class Test14 {
    @Test(timeout = 2000)
    public void Task14() throws Exception{
        boolean ok = true;

        Book original = new Book("Masa","Akunin", 100, 3);

        Book copy = (Book) original.clone();
        if(!original.toString().equals(copy.toString())){
            ok = false;
        }

        assertTrue("Task14 failed", ok);
    }

}
