package by.verghel.Test;

import by.verghel.Lab1.Task3;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class Test3 {
    @Test(timeout = 2000)
    public void Task3() throws Exception{
        double[] tg ={-0.1425465430742778, -3.380515006246586, 0.8714479827243188};
        Task3 task3 = new Task3();

        int j = 0;
        boolean ok = true;
        for (int i = 3; i <= 7; i += 2){
            if (tg[j] != task3.tg(i)){
                ok = false;
            }
            j++;
        }

        assertTrue("Task3 failed", ok);
    }
}
