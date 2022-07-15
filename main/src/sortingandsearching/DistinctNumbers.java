package sortingandsearching;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class DistinctNumbers {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int numberOfElements = Integer.parseInt(reader.readLine());

        StringTokenizer stringTokenizer = new StringTokenizer(reader.readLine(), " ");
        Set<Integer> setOfElements = new HashSet<>();

        while (numberOfElements-- > 0) {
            setOfElements.add(Integer.valueOf(stringTokenizer.nextToken()));
        }

        System.out.println(setOfElements.size());
    }
}
