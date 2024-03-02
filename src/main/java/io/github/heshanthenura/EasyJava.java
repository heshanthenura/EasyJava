package io.github.heshanthenura;

import java.util.*;

public class EasyJava {

    private static final Random random = new Random();

    /**
     * Generates a list of integers within the specified range with a default step of 1.
     * If neither end nor step are specified, returns a list from 0 to start (exclusive).
     * If only start is specified, returns a list from 0 to start (exclusive).
     * If start, end, and step are specified:
     * - If start < end and step > 0, returns a list from start to end (exclusive) with the specified step.
     * - If start > end and step < 0, returns a list from start to end (exclusive) with the specified negative step.
     * - If start > end and step > 0, returns a list from start to end (exclusive) in decreasing order with the specified step.
     *
     * @param start the starting value of the range (inclusive)
     * @param args  an optional array containing the ending value of the range (exclusive) and the step size
     * @return a list of integers within the specified range
     */
    public static List<Integer> range(int start, Integer... args) {
        List<Integer> numList = new ArrayList<>();

        int end = start; // Default end value
        int step = 1; // Default step size

        // Parse arguments
        if (args.length > 0) {
            if (args[0] != null) {
                end = args[0];
            }
            if (args.length > 1 && args[1] != null) {
                step = args[1];
            }
        }

        // If only start is specified, return a list from 0 to start (exclusive)
        if (args.length == 0) {
            for (int i = 0; i < start; i++) {
                numList.add(i);
            }
        } else {
            // If start, end, and step are specified
            if (start < end && step > 0) {
                for (int i = start; i < end; i += step) {
                    numList.add(i);
                }
            } else if (start > end && step < 0) { // If step is negative and start > end
                for (int i = start; i > end; i += step) {
                    numList.add(i);
                }
            } else if (start > end && step > 0) { // If start > end and step > 0 (return in decreasing order)
                for (int i = start; i > end; i -= step) {
                    numList.add(i);
                }
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
     * @param max the maximum value of the range (inclusive)
     * @return a random double within the specified range
     * @throws IllegalArgumentException if min is greater than max
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
     * @param max the maximum value of the range (inclusive)
     * @return a random float within the specified range
     * @throws IllegalArgumentException if min is greater than max
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



    /**
     * Prompts the user with a specified message and returns the input string.
     * If a delimiter string is provided, splits the input string by the delimiter and returns a list of tokens.
     *
     * @param args an optional array containing the prompt message and the delimiter character (optional)
     * @return the input string entered by the user, or a list of tokens if a delimiter is specified
     */
    public static Object input(String... args) {
        Scanner scanner = new Scanner(System.in);
        String prompt = "";
        String delimiter = "";

        if (args.length > 0) {
            prompt = args[0];
            if (args.length > 1) {
                delimiter = args[1];
            }
        }

        if (!prompt.isEmpty()) {
            System.out.print(prompt);
        }

        String input = scanner.nextLine();
        scanner.close();

        if (!delimiter.isEmpty()) {
            return Arrays.asList(input.split(delimiter));
        } else {
            return input;
        }
    }


}
