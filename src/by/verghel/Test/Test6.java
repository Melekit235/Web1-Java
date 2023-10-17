package by.verghel.Test;

import by.verghel.Lab1.Task6;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertTrue;

public class Test6 {
    @Test(timeout = 2000)
    public void Task6() throws Exception{
        Task6 task6 = new Task6();

        int[][] res = task6.makeMatrix(new int[]{1, 2, 3, 4, 5}, 5);
        boolean ok = Arrays.deepEquals(res,new int[][]{{1, 2, 3, 4, 5}, {2, 3, 4, 5, 1}, {3, 4, 5, 1, 2}, {4, 5, 1, 2, 3}, {5, 1, 2, 3, 4}});
        assertTrue("Task6 failed", ok);
    }
}
