package problems.bonusProblems;

import java.util.Scanner;

public class StringMingling {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();

        double startTime = System.nanoTime();
        String result = stringMingling(s1, s2, 0, "");
        double endTime = System.nanoTime();


        System.out.println(result);
        System.out.println("Time taken: " + ((endTime - startTime) / 1000000) + " milliseconds");
    }


    /**
     *
     * @param s1
     * @param s2
     * @param index
     * @param result
     * @return
     */
    public static String stringMingling(String s1, String s2, int index, String result) {
        if (index == s1.length()) {
            return result;
        }
        return stringMingling(s1, s2, index + 1, result  + s1.charAt(index) + s2.charAt(index));
    }
}
