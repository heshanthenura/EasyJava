import io.github.heshanthenura.EasyJava;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.List;
import java.util.Scanner;

import static org.junit.Assert.*;

public class EasyJavaTest {
    EasyJava easyJava = new EasyJava();

    @Test
    public void testRange() {


        // Test case 1: Regular range
        List<Integer> result1 = easyJava.range(0, 10, 1);
        assertEquals(List.of(0, 1, 2, 3, 4, 5, 6, 7, 8, 9), result1);

        // Test case 2: Range with step size
        List<Integer> result2 = easyJava.range(0, 10, 2);
        assertEquals(List.of(0, 2, 4, 6, 8), result2);

        // Test case 3: Range with negative step size
        List<Integer> result3 = easyJava.range(10, 0, -1);
        assertEquals(List.of(10, 9, 8, 7, 6, 5, 4, 3, 2, 1), result3);

        // Test case 4: Empty range
        List<Integer> result4 = easyJava.range(0, 0, 1);
        assertEquals(List.of(), result4);

        // Test case 5: Reverse range
        List<Integer> result5 = easyJava.range(10, 0, -2);
        assertEquals(List.of(10, 8, 6, 4, 2), result5);
    }

    @Test
    public void testRandomInt() {
        // Test random integer generation within specified range
        int randomNumber = EasyJava.randomInt(1, 10);
        assertTrue(randomNumber >= 1 && randomNumber <= 10);
    }

    @Test
    public void testRandomDouble() {
        // Test random double generation within specified range
        double randomDouble = EasyJava.randomDouble(1.0, 10.0);
        assertTrue(randomDouble >= 1.0 && randomDouble < 10.0);
    }

    @Test
    public void testRandomFloat() {
        // Test random float generation within specified range
        float randomFloat = EasyJava.randomFloat(1.0f, 10.0f);
        assertTrue(randomFloat >= 1.0f && randomFloat < 10.0f);
    }

    @Test
    public void testRandomBoolean() {
        // Test random boolean generation
        boolean randomBoolean = EasyJava.randomBoolean();
        assertNotNull(randomBoolean);
    }

    @Test
    public void testGetRandomElement() {
        // Test random element selection from a list
        List<String> fruits = List.of("Apple", "Banana", "Orange", "Grape");
        String randomFruit = EasyJava.getRandomElement(fruits);
        assertTrue(fruits.contains(randomFruit));
    }

    @Test
    public void testRangePrinting() {
        for (Integer i : EasyJava.range(10)) {
            System.out.println("*".repeat(i));
        }
    }

    @Test
    public void testInput() {
        // Prepare input and output streams
        String simulatedInput = "John Doe";
        ByteArrayInputStream inputStream = new ByteArrayInputStream(simulatedInput.getBytes());
        System.setIn(inputStream);
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));

        // Call the input method with prompt message
        String inputString = (String) EasyJava.input("Enter your name: ");

        // Check if the prompt message was printed
        assertEquals("Enter your name: ", outputStream.toString());

        // Check if the inputString is correct
        assertEquals("John Doe", inputString);

        // Reset System.in and System.out
        System.setIn(System.in);
        System.setOut(System.out);

        // Test with delimiter
        simulatedInput = "apple banana cherry";
        inputStream = new ByteArrayInputStream(simulatedInput.getBytes());
        System.setIn(inputStream);
        outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));

        // Call the input method with prompt message and delimiter
        List<String> inputList = (List<String>) EasyJava.input("Enter fruits separated by space: ", " ");

        // Check if the prompt message was printed
        assertEquals("Enter fruits separated by space: ", outputStream.toString());

        // Check if the inputList is correct
        assertEquals(List.of("apple", "banana", "cherry"), inputList);

        // Reset System.in and System.out
        System.setIn(System.in);
        System.setOut(System.out);
    }

    public static void main(String[] args) {
        List<String> name = (List<String>) EasyJava.input("Test: "," ");
        System.out.println(name.size());
    }
}
