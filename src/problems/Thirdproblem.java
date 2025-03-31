package problems;

import java.util.Scanner;

public class Thirdproblem {
    public static void start() {
        System.out.println("Task: You are given a number “n”, write the function for checking \n" +
                "whether“n” is prime.");

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        double startTime = System.nanoTime();
        boolean result = isPrime(n);
        double endTime = System.nanoTime();

        if (result) {
            System.out.println("Prime");
        } else {
            System.out.println("Composite");
        }
        System.out.println("Time taken: " + ((endTime - startTime) / 1000000) + " milliseconds");
    }

    /**
     * The method that return "True" if number is prime and "False" if number is composite
     * Times complexity: O(√n)
     * @param n The number to determine its type(composite or prime)
     * @return True or False
     */
    public static Boolean isPrime(int n) {
        if (n < 2) return false;
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
