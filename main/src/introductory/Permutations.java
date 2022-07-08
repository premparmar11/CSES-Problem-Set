package introductory;

import java.util.Scanner;

public class Permutations {
    public static void main(String[] args) {

        // user input
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        // require string builder for time efficiency
        StringBuilder sb = new StringBuilder();

        if (n == 1) {
            System.out.print(1);
        } else if (n > 1 && n < 4) {
            System.out.print("NO SOLUTION");
        } else {
            for (long i = 2; i <= n; i += 2) sb.append(i).append(" ");
            long i = 1;
            for (; i <= n ; i += 2) {
                sb.append(i);
                 if ((i + 2) <= n) {
                     sb.append(" ");
                 }
            }
            System.out.println(sb);
        }
    }
}
