package by.verghel.Lab1;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Input n");
        int n = scanner.nextInt();
        int[] a = new int[n];
        for (int i = 0; i< n; i++){
            System.out.println("Input " + i + " element of array" );
            a[i] = scanner.nextInt();
        }

        outMatrix(makeMatrix(a, n), n);
    }

    public static int[][] makeMatrix(int[] a, int n) {
        int[][] matrix = new int[n][n];
        int shift = 0;
        for (int i = 0; i < n; i++){
            for (int j = 0; j < n; j++){
                matrix[i][j] = a[(j+shift) % n];
            }
            shift++;
        }

        return matrix;
    }

    private static void outMatrix(int[][] matrix, int n){
        for (int i = 0; i < n; i++){
            for (int j = 0; j < n; j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
}
