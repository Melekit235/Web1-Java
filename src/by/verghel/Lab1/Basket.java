package by.verghel.Lab1;

import java.util.ArrayList;
import java.util.List;

public class Basket {
    private List<Ball> balls;

    public Basket() {
        balls = new ArrayList<>();
    }

    public void addBall(Ball ball) {
        balls.add(ball);
    }

    public int calculateWeight() {
        int totalWeight = 0;
        for (Ball ball : balls) {
            totalWeight += ball.getWeight();
        }
        return totalWeight;
    }

    public int countColorBalls(String ballsColor) {
        int ballsCount = 0;
        for (Ball ball : balls) {
            if (ballsColor.equalsIgnoreCase(ball.getColor())) {
                ballsCount++;
            }
        }
        return ballsCount;
    }
}
