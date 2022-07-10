package introductory;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TwoSets {
    public static void main(String[] args) {

        // user input
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int sum = (n * (n + 1)) / 2;

        if (sum % 2 != 0) {
            System.out.println("NO");
            return;
        }
        System.out.println("YES");

        // 1 set should contain these much amount of elements
        sum = sum / 2;

        List<Integer> oneSet = new ArrayList<>();
        List<Integer> secondSet = new ArrayList<>();
        for (int i = n; i > 0; i--) {
            if ((sum - i) >= 0) {
                oneSet.add(i);
                sum = sum - i;
            } else {
                secondSet.add(i);
            }
        }

        System.out.println(oneSet.size());
        for (int i = 0; i < oneSet.size(); i++) {
            System.out.print(oneSet.get(i));
            if (i + 1 < oneSet.size()) {
                System.out.print(" ");
            } else {
                System.out.println();
            }
        }

        System.out.println(secondSet.size());
        for (int i = 0; i < secondSet.size(); i++) {
            System.out.print(secondSet.get(i));
            if (i + 1 < secondSet.size()) {
                System.out.print(" ");
            }
        }
    }
}
