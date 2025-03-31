package problems;

import java.util.Scanner;

public class Eighthproblem {
    public static void start() {
        System.out.println("Task: You are given a string “s”, write the function for checking \n" +
                "whether “s” is all consists of digits");

        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        double startTime = System.nanoTime();
        boolean result = isAllDigits(str);
        double endTime = System.nanoTime();

        System.out.println(result ? "YES" : "NO");
        System.out.println("Time taken: " + ((endTime - startTime) / 1000000) + " milliseconds");
    }

    /**
     * Method recursively checks if the string consists only of digits.
     * Time complexity: O(n)
     *
     * @param str The input string.
      * @return True if the string contains only digits, false otherwise.
     */

    public static boolean isAllDigits(String str) {
        if(str == null || str.length() == 0){
            return false;
        }
        if (str.length() == 1) {
            return Character.isDigit(str.charAt(0));
        }

        return Character.isDigit(str.charAt(0)) && isAllDigits(str.substring(1));
    }
}
