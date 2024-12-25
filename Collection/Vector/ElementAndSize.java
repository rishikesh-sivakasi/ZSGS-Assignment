package Vector;

import java.util.Vector;
import java.util.Random;

public class ElementAndSize {
    public static void main(String[] args) {
        Vector<Double> vector = new Vector<>();

        Random random = new Random();
        for (int i = 0; i < 5; i++) {
            vector.add(random.nextDouble() * 100);
        }

        System.out.println("Initial Vector: " + vector);

        boolean containsTenPointFive = vector.contains(10.5);
        System.out.println("Does the vector contain 10.5? " + containsTenPointFive);

        System.out.println("Size before adding another value: " + vector.size());
        vector.add(50.5);
        System.out.println("Size after adding another value: " + vector.size());

        System.out.println("Updated Vector: " + vector);
    }
}

