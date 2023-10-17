package by.verghel.Test;

import by.verghel.Lab1.Task5;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class Test5 {
    @Test(timeout = 2000)
    public void Task5() throws Exception{
        Task5 task5 = new Task5();

        int res = task5.findMinRemove(new int[]{6, 3, 77, 21, 45, 2, 7},Integer.MIN_VALUE, 0);
        boolean ok = res == 4;
        assertTrue("Task5 failed", ok);
    }
}
