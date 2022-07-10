package introductory;

import java.util.Scanner;

public class NumberSpiral {
    public static void main(String[] args) {

        // user input
        Scanner scanner = new Scanner(System.in);
        int tasks = scanner.nextInt();

        while (tasks-- > 0) {

            long x = scanner.nextLong();
            long y = scanner.nextLong();

            long ans = 0;
            long MIN_VALUE = 0;
            long MAX_VALUE = 0;

            if (x >= y) {
                MAX_VALUE = x * x;
                MIN_VALUE = MAX_VALUE - ((x - 1) * 2);
            } else {
                MAX_VALUE = y * y;
                MIN_VALUE = MAX_VALUE - ((y - 1) * 2);
            }

            if (x == 1 && y == 1) {
                ans = 1;
            } else if (x == y) {
                ans = MAX_VALUE - (x-1);
            } else if (x > y) {
                if (x % 2 == 0) {
                    ans = MAX_VALUE - (y-1);
                } else {
                    ans = MIN_VALUE + (y-1);
                }
            } else {
                if (y % 2 == 0) {
                    ans = MIN_VALUE + (x-1);
                } else {
                    ans = MAX_VALUE - (x-1);
                }
            }

            System.out.println(ans);
        }
    }
}
