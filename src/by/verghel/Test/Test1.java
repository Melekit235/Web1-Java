package by.verghel.Test;

import by.verghel.Lab1.Task1;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class Test1 {
    @Test(timeout = 2000)
    public void Task1() throws Exception {
        Task1 task1 = new Task1();

        double res = task1.calculateExpression(1,1);
        boolean ok = res == 1.6089406034772686;
        assertTrue("Task1 failed", ok);
    }
}
