package by.verghel.Test;

import by.verghel.Lab1.Ball;
import by.verghel.Lab1.Basket;
import by.verghel.Lab1.Task9;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class Test9 {
    @Test(timeout = 2000)
    public void Task9() throws Exception{
        Task9 task9 = new Task9();

        int[] weight = {5, 89, 23, 34, 1};
        String[] ballColor = {"blue", "red", "black", "blue", "blue"};
        boolean ok = true;

        Basket basket = new Basket();
        for (int i = 0; i< 5; i++){
            basket.addBall(new Ball(ballColor[i],weight[i]));
        }
        if(basket.calculateWeight() != 152 || basket.countColorBalls("blue") != 3){
            ok = false;
        }

        assertTrue("Task9 failed", ok);
    }
}
