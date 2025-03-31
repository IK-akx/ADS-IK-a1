package problems;
import java.util.Scanner;

public class Firstproblem {
    public static void start() {
        System.out.println("Task: You are given a number “n” and an array of “n” elements, \n" +
                "write the function that returns minimum of them.  ");

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("Invalid array length");
            return;
        }

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }


        double startTime = System.nanoTime();
        int min = getMin(arr, n);
        double endTime = System.nanoTime();


        System.out.println("The minimum number is " + min);
        System.out.println("Time taken: " + ((endTime - startTime) / 1000000) + " milliseconds");
    }

    /**
     * This is the method to find and return the minimum element of an array
     * The method uses a for loop.
     * Time complexity: O(n)
     * @param nums An array in which you need to find the minimum number.
     * @param n Size of array
     * @return min element
     */
    public static int getMin(int[] nums, int n) {
        int min = nums[0];
        for(int i = 1; i < n; i++) {
            if (nums[i] < min) {
                min = nums[i];
            }
        }

        return min;
    }

}
