package problems;

import java.util.Scanner;

public class Ninthproblem {
    public static void start() {
        System.out.println("Task: You are given numbers“n” and “k”,write the program that \n" +
                "finds binomial coefficient.");

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();

        if (k < 0 || k > n) {
            System.out.println("Invalid input");
            return;
        }

        double startTime = System.nanoTime();
        int result = binomialCoefficientCalculator(n, k);
        double endTime = System.nanoTime();

        System.out.println(result);
        System.out.println("Time taken: " + ((endTime - startTime) / 1000000) + " milliseconds");
    }

    /**
     * Method calculates the binomial coefficient using recursion
     * Time complexity: O(2^n)
     * @param n Total number of elements.
     * @param k Number of selected elements.
     * @return Binomial coefficient C(n, k).
     */

    public static int binomialCoefficientCalculator(int n, int k) {

        if (k == 0 || n == k) {
            return 1;
        }

        return binomialCoefficientCalculator(n - 1, k) + binomialCoefficientCalculator(n - 1, k - 1);

    }
}
