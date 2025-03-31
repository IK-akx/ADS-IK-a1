package problems;

import java.util.Scanner;

public class Seventhproblem {
    public static void start() {
        System.out.println("Task: You are given a number “n” and an array of “n” elements, \n" +
                "write the program that returns given array in reverse order \n" +
                "without using array data structure.\n" +
                " (Hint: recursion)");

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Original Array: ");
        printArray(arr, n);
        System.out.println();


        double startTime = System.nanoTime();
        reverseArray(arr, 0, n - 1);
        double endTime = System.nanoTime();


        System.out.println("Reversed Array: ");
        printArray(arr, n);

        System.out.println();
        System.out.println("Time taken: " + ((endTime - startTime) / 1000000) + " milliseconds");
    }

    /**
     * This method prints the elements of an array.
     *
     * @param arr The array to be printed.
     * @param n   The size of the array.
     */
    public static void printArray(int[] arr, int n) {
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    /**
     * Method reverses the given array using recursion.
     * It swaps the first and last elements and then calls itself with reduced bounds.
     * Time complexity: O(n)
     *
     * @param arr   The array to be reversed.
     * @param start The starting index.
     * @param end   The ending index.
     */
    public static void reverseArray(int[] arr, int start, int end) {
        if (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            reverseArray(arr, start + 1, end - 1);
        }
    }

}
