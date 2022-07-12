package introductory;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PalindromeReorder {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String string = reader.readLine();

        int[] numOfOcc = new int[26];

        for (char character : string.toCharArray()) {
            numOfOcc[character - 'A']++;
        }

        boolean isSingleCharacterExist = (string.length() % 2 != 0);
        StringBuilder palindromString = new StringBuilder();
        int alphabetStart = 65;

        for (int i = 0; i < 26; i++) {
            char character = (char) (alphabetStart + i);

            if (numOfOcc[i] == string.length()) {
                System.out.println(string);
                return;
            }

            if (numOfOcc[i] % 2 == 0) {
                while (numOfOcc[i] > 0) {
                    palindromString = new StringBuilder(character + palindromString.toString() + character);
                    numOfOcc[i] -= 2;
                }
            } else {
                if (isSingleCharacterExist) {
                    isSingleCharacterExist = false;
                    StringBuilder newString = new StringBuilder();

                    while (numOfOcc[i]-- > 0) {
                        newString.append(character);
                    }

                    palindromString = new StringBuilder(palindromString.substring(0, (palindromString.length() / 2)) + newString +
                            palindromString.substring(palindromString.length() / 2));
                } else {
                    System.out.println("NO SOLUTION");
                    return;
                }
            }
        }

        System.out.println(palindromString);
    }
}
