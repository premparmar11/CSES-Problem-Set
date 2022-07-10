package introductory;

import java.util.Scanner;

public class BitStrings {

    private static final long MODULO = 1000000007;

    public static void main(String[] args) {
        // user input
        Scanner scanner = new Scanner(System.in);
        long n = scanner.nextLong();
        long answer = 1;
        for (int i = 0; i < n; i++) {
            answer = (answer << 1) % MODULO;
        }
        System.out.println(answer);
    }
}
