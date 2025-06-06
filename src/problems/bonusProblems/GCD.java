package problems.bonusProblems;

import java.util.Scanner;

public class GCD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        a = Math.abs(a);
        b = Math.abs(b);


        double startTime = System.nanoTime();
        int result = GCD(a, b);
        double endTime = System.nanoTime();


        System.out.println(result);
        System.out.println("Time taken: " + ((endTime - startTime) / 1000000) + " milliseconds");
    }

    /**
     * Method calculates the GCD using the Euclidean algorithm
     * Time Complexity: O(log(min(a, b)))
     *
     * @param a First number.
     * @param b Second number.
     * @return GCD of a and b.
     */

    public static int GCD(int a, int b) {
        if (b == 0) {
            return a;
        }

        return GCD(b, a % b);
    }

}

