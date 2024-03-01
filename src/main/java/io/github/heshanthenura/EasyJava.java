package io.github.heshanthenura;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class EasyJava {

    private static final Random random = new Random();

    /**
     * Generates a list of integers within the specified range.
     *
     * @param start the starting value of the range (inclusive)
     * @param end   the ending value of the range (exclusive)
     * @param step  the step size between consecutive integers
     * @return a list of integers within the specified range
     */
    public List<Integer> range(int start, int end, int step) {
        List<Integer> numList = new ArrayList<>();

        if (step > 0) {
            for (int i = start; i < end; i += step) {
                numList.add(i);
            }
        } else if (step < 0) {
            for (int i = start; i > end; i += step) {
                numList.add(i);
            }
        }
        return numList;
    }

    /**
     * Generates a random integer within the specified range.
     *
     * @param min the minimum value of the range (inclusive)
     * @param max the maximum value of the range (inclusive)
     * @return a random integer within the specified range
     * @throws IllegalArgumentException if min is greater than max
     */
    public static int randomInt(int min, int max) {
        if (min > max) {
            throw new IllegalArgumentException("min must be less than or equal to max");
        }
        return random.nextInt(max - min + 1) + min;
    }

    /**
     * Generates a random double within the specified range.
     *
     * @param min the minimum value of the range (inclusive)
     * @param max the maximum value of the range (exclusive)
     * @return a random double within the specified range
     * @throws IllegalArgumentException if min is greater than or equal to max
     */
    public static double randomDouble(double min, double max) {
        if (min >= max) {
            throw new IllegalArgumentException("min must be less than max");
        }
        return min + (max - min) * random.nextDouble();
    }

    /**
     * Generates a random float within the specified range.
     *
     * @param min the minimum value of the range (inclusive)
     * @param max the maximum value of the range (exclusive)
     * @return a random float within the specified range
     * @throws IllegalArgumentException if min is greater than or equal to max
     */
    public static float randomFloat(float min, float max) {
        if (min >= max) {
            throw new IllegalArgumentException("min must be less than max");
        }
        return min + (max - min) * random.nextFloat();
    }

    /**
     * Generates a random boolean value.
     *
     * @return a random boolean value (true or false)
     */
    public static boolean randomBoolean() {
        return random.nextBoolean();
    }

    /**
     * Returns a random element from the given list.
     *
     * @param list the list from which to select a random element
     * @param <T>  the type of elements in the list
     * @return a random element from the list
     * @throws IllegalArgumentException if the list is empty
     */
    public static <T> T getRandomElement(List<T> list) {
        if (list.isEmpty()) {
            throw new IllegalArgumentException("List cannot be empty");
        }
        int randomIndex = random.nextInt(list.size());
        return list.get(randomIndex);
    }

}
