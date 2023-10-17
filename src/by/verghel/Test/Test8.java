package by.verghel.Test;

import by.verghel.Lab1.Task8;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertTrue;

public class Test8 {@Test(timeout = 2000)
    public void Task8() throws Exception{
        Task8 task8 = new Task8();

        int[] res = task8.mergeArrays(new int[]{1,2,6,7,8},5, new int[]{2,3,4,5,9},5);
        boolean ok = Arrays.equals(res, new int[] {1,2,2,3,4,5,6,7,8,9});
        assertTrue("Task8 failed", ok);
    }
}
