package by.verghel.Lab1;

import java.util.Scanner;

import static java.lang.Math.cos;
import static java.lang.Math.sin;

public class Task3 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input a");
        int a = scanner.nextInt();
        System.out.println("Input b");
        int b = scanner.nextInt();
        System.out.println("Input h");
        int h = scanner.nextInt();

        calculateTg(a, b, h);
    }
    public static void calculateTg(int a, int b, int h){
        for (int i = a; i <= b; i += h){
            System.out.println(i+" "+ tg(i));
        }
    }

    public static double tg(int x){
        return sin(x)/cos(x);
    }

}
