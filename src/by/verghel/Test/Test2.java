package by.verghel.Test;

import by.verghel.Lab1.Task2;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class Test2 {
    @Test(timeout = 2000)
    public void Task2() throws Exception {
        Task2 task2 = new Task2();

        boolean res = task2.checkAffiliation(1, 1);
        boolean ok = res == true;
        assertTrue("Task2 failed", ok);
    }
}
