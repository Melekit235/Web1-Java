package by.verghel.Test;

import by.verghel.Lab1.ProgrammerBook;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class Test13 {
    @Test(timeout = 2000)
    public void Task13() throws Exception{
        boolean ok = true;

        ProgrammerBook book1 = new ProgrammerBook("C++","Akunin", 100,1, "en", 1);
        ProgrammerBook book2 = new ProgrammerBook("Java","Roulling", 150,2, "ru", 3);
        ProgrammerBook book3 = new ProgrammerBook("C#","Akunin", 100,3, "en", 1);


        if(book1.hashCode() != 796177722 ||
                book1.equals(book2) ||
                book1.equals(book3) ||
                !book2.toString().equals("Book{title='Java', author='Roulling', price=150, edition=0, language='ru', level=3}")
        ){
            ok = false;
        }

        assertTrue("Task13 failed", ok);
    }
}
