package introductory;

import java.util.Scanner;

public class TrailingZeros {
    public static void main(String[] args) {
        // user input
        Scanner scanner = new Scanner(System.in);
        long n = scanner.nextLong();

        long numberOfTrailingZeros = 0;
        long divisor = 5;

        while (n >= divisor) {
            numberOfTrailingZeros += (n / divisor);
            divisor *= 5;
        }

        System.out.println(numberOfTrailingZeros);
    }
}
