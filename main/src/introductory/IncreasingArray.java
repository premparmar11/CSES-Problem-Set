package introductory;

import java.util.Scanner;

public class IncreasingArray {
    public static void main(String[] args) {

        // user input
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        long[] arr = new long[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        long numberOfMoves = 0;
        for (int i = 0; i < (n-1); i++) {

            if (arr[i] > arr[i+1]) {
                numberOfMoves += (arr[i] - arr[i+1]);
                arr[i+1] = arr[i];
            }
        }

        System.out.println(numberOfMoves);
    }
}
