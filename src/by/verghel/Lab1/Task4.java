package by.verghel.Lab1;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input N");
        int N = scanner.nextInt();
        int[] array = new int[N];
        for (int i = 0; i< N; i++){
            System.out.println("Input " + i + " element of array" );
            array[i] = scanner.nextInt();
        }
        checkPrime(N, array);
    }

    private static void checkPrime(int N, int[] array) {
        for (int i = 0; i < N; i++){
            if(isPrime(array[i])){
                System.out.println(i);
            }
        }
    }

    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }

        if (num <= 3) {
            return true;
        }

        if (num % 2 == 0 || num % 3 == 0) {
            return false;
        }

        for (int i = 5; i * i <= num; i += 6) {
            if (num % i == 0 || num % (i + 2) == 0) {
                return false;
            }
        }

        return true;
    }
}
