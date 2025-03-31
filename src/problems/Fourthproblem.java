package problems;

import java.util.Scanner;

public class Fourthproblem {
    public static void start() {
        System.out.println("Task: You are given a number “n”, write the program using recursion for\n" +
                " finding “n!”");

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();


        double startTime = System.nanoTime();
        int result = factorial(n);
        double endTime = System.nanoTime();

        System.out.println("Factorial: " + result);
        System.out.println("Time taken: " + ((endTime - startTime) / 1000000) + " milliseconds");
    }

    /**
     * Method that returns factorial of the number
     * Method uses a recursive approach
     * Time complexity: O(n)
     * @param n The number whose factorial you want to find
     * @return The factorial
     */
    public static int factorial(int n) {
        if (n == 1 || n == 0)
            return 1;

        return n * factorial(n - 1);
    }
}
