package problems;

import java.util.Scanner;

public class Secondproblem {
    public static void start() {
        System.out.println("Task: You are given a number “n” and an array of “n” elements, \n" +
                "write the function that returns average of them. ");

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }


        double startTime = System.nanoTime();
        double ava = getAva(arr, n);
        double endTime = System.nanoTime();


        System.out.println("The avarage is " + ava);
        System.out.println("Time taken: " + ((endTime - startTime) / 1000000) + " milliseconds");
    }

    /**
     * Method returns the avarage of an array
     * Times complexity: O(n)
     * @param nums An array in which you need to find the avarage
     * @param n Size of the array
     * @return The avarage of an array
     */

    public static double getAva(int[] nums, int n) {
        double sum = 0;
        for(int i = 0; i < n; i++) {
            sum += nums[i];
        }
        return (sum/n);
    }
}
