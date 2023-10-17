package by.verghel.Lab1;

import java.util.Scanner;

import static java.lang.Math.abs;
import static java.lang.Math.sin;

public class Task1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Input x");
        int x = scanner.nextInt();
        System.out.println("Input y");
        int y = scanner.nextInt();

        System.out.println("Answer: " + calculateExpression(x, y));

    }

    public static double calculateExpression(int x, int y) {
        double answer = ((1 + (sin(x + y) * sin(x + y))) / (2 + abs(x - 2*x / (2 + x * x * y * y))) + x);
        return answer;
    }
}