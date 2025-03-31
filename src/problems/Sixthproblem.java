package problems;

import java.util.Scanner;

public class Sixthproblem {
    public static void start() {
        System.out.println("Task: You are given numbers “a” and “n”, write the function that \n" +
                "returns “a**n”.");

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int n = sc.nextInt();

        double startTime = System.nanoTime();
        int result = calculatePow(a, n);
        double endTime = System.nanoTime();

        System.out.println(result);
        System.out.println("Time taken: " + ((endTime - startTime) / 1000000) + " milliseconds");
    }

    /**
     * Method calculates the power of a number using recursion.
     * It follows the formula: a^n = a * a^(n-1)
     * Time complexity: O(n)
     *
     * @param a The base number
     * @param n The degree
     * @return The results of a^n
     */

    public static int calculatePow(int a, int n) {
        if (n == 1){
            return a;
        }else if (n == 0){
            return 1;
        }

        return a * calculatePow(a, n - 1);
    }
}
