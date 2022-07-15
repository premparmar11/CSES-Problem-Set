package introductory;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class GrayCode {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());

        char[] initArr = new char[n];
        while (n-- > 0) {
            initArr[n] = '0';
        }

        System.out.println(new String(initArr));
        for (int i = initArr.length - 1; i >= 0; i--) {
            initArr[i] = '1';
            System.out.println(new String(initArr));
        }

        for (int i = 1; i < initArr.length; i++) {
            initArr[i] = '0';
            System.out.println(new String(initArr));
        }

    }
}
