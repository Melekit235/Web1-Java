package by.verghel.Lab1;

import java.util.Scanner;

public class Task8 {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Input n");
        int n = scanner.nextInt();
        int[] a = new int[n];
        for (int i = 0; i< n; i++){
            System.out.println("Input " + i + " element of array" );
            a[i] = scanner.nextInt();
        }

        System.out.println("Input m");
        int m = scanner.nextInt();
        int[] b = new int[m];
        for (int i = 0; i< m; i++){
            System.out.println("Input " + i + " element of array" );
            b[i] = scanner.nextInt();
        }

        outArray(mergeArrays(a, n, b, m), n + m);
    }

    public static int[] mergeArrays(int[] a, int n, int[] b, int m) {
        int[] mergedArray = new int[n + m];

        int i = 0;
        int j = 0;
        int z = 0;
        while (i < n && j < m){
            if(a[i] < b[j]){
                mergedArray[z] = a[i];
                i++;
            }
            else{
                mergedArray[z] = b[j];
                j++;
            }
            z++;
        }

        while (i < n) {
            mergedArray[z] = a[i];
            i++;
            z++;
        }

        while (j < m) {
            mergedArray[z] = b[j];
            j++;
            z++;
        }

        return mergedArray;
    }

    private static void outArray(int[] a, int n){
        for (int i = 0; i < n; i++){
            System.out.print(a[i] + " ");
        }
    }
}
