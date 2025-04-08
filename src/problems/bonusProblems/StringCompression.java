package problems.bonusProblems;

import java.util.Scanner;

public class StringCompression {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        double startTime = System.nanoTime();
        String res = stringCompression(str, 0, "", 1);
        double endTime = System.nanoTime();

        System.out.println(res);
        System.out.println("Time taken: " + ((endTime - startTime) / 1000000) + " milliseconds");
    }

    public static String stringCompression(String str, int index, String result, int count) {
        if (index == str.length()) {
            return result;
        }

        if(index + 1 < str.length() && str.charAt(index) == str.charAt(index + 1)) {
            return stringCompression(str, index + 1, result, count + 1);
        }else{
            result += str.charAt(index);
            if(count > 1){
                result += count;
            }
            return stringCompression(str, index + 1, result, 1);
        }

    }
}
