package by.verghel.Lab1;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Input n");
        int n = scanner.nextInt();
        int[] A = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Input " + i + " element of array");
            A[i] = scanner.nextInt();
        }


        int minRemove = findMinRemove(A, Integer.MIN_VALUE, 0);

        System.out.println("Min: " + minRemove);
    }

    public static int findMinRemove(int[] A, int prev, int currentIndex) {
        if (currentIndex == A.length) {
            return 0;
        }

        int includingCurrent = Integer.MAX_VALUE;
        if (A[currentIndex] > prev) {
            includingCurrent = findMinRemove(A, A[currentIndex], currentIndex + 1);
        }

        int excludingCurrent = 1 + findMinRemove(A, prev, currentIndex + 1);

        return Math.min(includingCurrent, excludingCurrent);
    }
}
