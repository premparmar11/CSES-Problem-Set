package introductory;

import java.util.Scanner;

public class MissingNumber {
    public static void main(String[] args) {

        // user input
        Scanner scanner = new Scanner(System.in);
        long n = scanner.nextLong();

        long sum = 0;
        long totalSum = (n * (n + 1)) / 2;

        while (--n > 0) {
            sum += Long.parseLong(scanner.next());
        }

        System.out.println(totalSum - sum);
    }
}
