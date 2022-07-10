package introductory;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class CoinPiles {

    public static void main(String[] args) throws IOException {

        // user input
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        long n = Long.parseLong(reader.readLine());

        while (n-- > 0) {
            StringTokenizer nextLine = new StringTokenizer(reader.readLine());
            long a = Long.parseLong(nextLine.nextToken());
            long b = Long.parseLong(nextLine.nextToken());

            long totalCoins = a + b;

            boolean isEmptyPossible = false;

            if ((totalCoins % 3) == 0) {
                if (a == b) {
                    isEmptyPossible = true;
                } else {
                    long diff = Math.abs(a - b);
                    if (a > b) {
                        if (diff <= (a >> 1)) {
                            isEmptyPossible = true;
                        }
                    } else {
                        if (diff <= (b >> 1))
                            isEmptyPossible = true;
                    }
                }
            }

            if (isEmptyPossible) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}