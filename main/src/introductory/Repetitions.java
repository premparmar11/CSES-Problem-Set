package introductory;

import java.util.Scanner;

public class Repetitions {
    public static void main(String[] args) {

        // user input
        Scanner scanner = new Scanner(System.in);
        String inputString = scanner.next();

        int longestSequence = 1;
        int result = 1;
        char[] chars = inputString.toCharArray();
        for (int i = 1; i < chars.length; i++) {
            if (chars[i-1] != chars[i]) {
                longestSequence = 0;
            }
            longestSequence++;
            result = Math.max(result, longestSequence);
        }

        System.out.println(result);
    }
}
