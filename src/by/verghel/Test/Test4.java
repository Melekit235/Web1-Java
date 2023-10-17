package by.verghel.Test;

import by.verghel.Lab1.Task4;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class Test4 {
    @Test(timeout = 2000)
    public void Task4() throws Exception {
        Task4 task4 = new Task4();

        int[] array = {3, 6, 7, 9, 31};
        boolean[] check = {true, false, true, false, true};
        boolean ok = true;

        for (int i = 0; i < 5; i++) {
            if (task4.isPrime(array[i]) != check[i]) {
                ok = false;
            }
        }
        assertTrue("Task4 failed", ok);
    }
}
