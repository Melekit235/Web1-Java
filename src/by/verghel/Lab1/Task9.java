package by.verghel.Lab1;

import java.util.Scanner;


public class Task9 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input number of balls");
        int numberBalls = scanner.nextInt();

        Basket basket = new Basket();
        for (int i = 0; i < numberBalls; i++) {
            System.out.println("Input weight of " + i + " ball");
            int weight = scanner.nextInt();
            System.out.println("Input color of " + i + " ball");
            scanner.nextLine();
            String ballColor = scanner.nextLine();
            basket.addBall(new Ball(ballColor, weight));
        }
        System.out.println("Total weight: " + basket.calculateWeight());
        System.out.println("Numbers of blue balss: " + basket.countColorBalls("blue"));

    }
}
