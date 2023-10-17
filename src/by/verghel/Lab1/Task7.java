package by.verghel.Lab1;

import java.util.Scanner;

public class Task7 {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Input n");
        int n = scanner.nextInt();
        int[] a = new int[n];
        for (int i = 0; i< n; i++){
            System.out.println("Input " + i + " element of array" );
            a[i] = scanner.nextInt();
        }

        outArray(sortArray(a, n), n);
    }

    public static int[] sortArray(int[] a, int n) {
        int i = 0;
        while (i < n-1){
            if( a[i] <= a[i+1]){
                i++;
            }
            else {
                if(i != 0){
                    int temp = a[i];
                    a[i] = a[i+1];
                    a[i+1] = temp;
                    i--;
                }
                else{
                    int temp = a[i];
                    a[i] = a[i+1];
                    a[i+1] = temp;
                }
            }
        }

        return a;
    }

    private static void outArray(int[] a, int n){
        for (int i = 0; i < n; i++){
            System.out.print(a[i] + " ");
        }
    }

}
