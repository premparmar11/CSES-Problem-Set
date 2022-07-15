package sortingandsearching;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.StringTokenizer;

public class Apartments {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer initValues = new StringTokenizer(reader.readLine(), " ");

        int numberOfApplicants = Integer.parseInt(initValues.nextToken());
        int numberOfApartments = Integer.parseInt(initValues.nextToken());
        int liberality = Integer.parseInt(initValues.nextToken());

        StringTokenizer desiredSizes = new StringTokenizer(reader.readLine(), " ");
        Queue<Integer> desiredSizesQueue = new PriorityQueue<>();
        while (numberOfApplicants-- > 0){
            desiredSizesQueue.add(Integer.parseInt(desiredSizes.nextToken()));
        }

        StringTokenizer apartmentSizes = new StringTokenizer(reader.readLine(), " ");
        Queue<Integer> apartmentSizesQueue = new PriorityQueue<>();
        while (numberOfApartments-- > 0){
            apartmentSizesQueue.add(Integer.parseInt(apartmentSizes.nextToken()));
        }

        int result = 0;

        while (!desiredSizesQueue.isEmpty() && !apartmentSizesQueue.isEmpty()) {

            int desire = desiredSizesQueue.peek();
            int aptSize = apartmentSizesQueue.peek();

            if (desire == aptSize || (((desire - liberality) <= aptSize) && (aptSize <=  (desire + liberality) ))) {
                result++;
                desiredSizesQueue.poll();
                apartmentSizesQueue.poll();
                continue;
            }

            if (desire < aptSize) {
                desiredSizesQueue.poll();
            }
            if (desire > aptSize) {
                apartmentSizesQueue.poll();
            }
        }

        System.out.println(result);

    }
}
