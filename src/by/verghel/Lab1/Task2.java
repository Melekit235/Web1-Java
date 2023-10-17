package by.verghel.Lab1;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input x");
        float x = scanner.nextInt();
        System.out.println("Input y");
        float y = scanner.nextInt();

        System.out.println("Answer: " + checkAffiliation(x, y));
    }

    public static boolean checkAffiliation(float x, float y) {

        if (y > 5 || y < -3 || x > 6 || x < -6) {
            return false;
        }
        if (((x > -6 && x < -4) || (x > 4 && x < 6)) && y > 0) {
            return false;
        }

        return true;
    }
}
