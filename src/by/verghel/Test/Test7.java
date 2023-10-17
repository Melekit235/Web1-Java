package by.verghel.Test;

import by.verghel.Lab1.Task7;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertTrue;

public class Test7 {
    @Test(timeout = 2000)
    public void Task7() throws Exception{
        Task7 task7 = new Task7();

        int[] res = task7.sortArray(new int[] {5,4,3,2,1}, 5);
        boolean ok = Arrays.equals(res, new int[] {1,2,3,4,5});
        assertTrue("Task7 failed", ok);
    }
}
