package problems;

import java.util.Scanner;

public class Fifthproblem {
    public static void start() {
        System.out.println("Task: You are given a number “n”, write the function for finding n-th\n" +
                " elements in Fibonacci sequence using recursion. (Fn = Fn-1+ Fn-2). \n" +
                "F0= 0, F1 = 1");

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();


        double startTime = System.nanoTime();
        int fibElement = fibonacci(n);
        double endTime = System.nanoTime();

        System.out.println(fibElement);
        System.out.println("Time taken: " + ((endTime - startTime) / 1000000) + " milliseconds");

    }

    /**
     * Method returns the n-th Fibonacci number
     * It use recursion
     * Time complexity: O(2^n)
     *
     * @param n The position in the Fibonacci
     * @return The Fibonacci number at given position
     */

    public static int fibonacci(int n) {
        if(n == 1 || n == 0){
            return n;
        }

        return fibonacci(n - 1) + fibonacci(n - 2);
    }
}
