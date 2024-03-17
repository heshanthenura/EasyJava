package io.github.heshanthenura;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.*;

public class EasyJava {

    private static final Random random = new Random();

    /**
     * Generates a list of integers within the specified range with a default step of 1.
     * If neither end nor step are specified, returns a list from 0 to start (exclusive).
     * If only start is specified, returns a list from 0 to start (exclusive).
     * If start, end, and step are specified:
     * <ul>
     *   <li>If start &lt; end and step &gt; 0, returns a list from start to end (exclusive) with the specified step.</li>
     *   <li>If start &gt; end and step &lt; 0, returns a list from start to end (exclusive) with the specified negative step.</li>
     *   <li>If start &gt; end and step &gt; 0, returns a list from start to end (exclusive) in decreasing order with the specified step.</li>
     * </ul>
     *
     * @param start the starting value of the range (inclusive)
     * @param args  an optional array containing the ending value of the range (exclusive) and the step size
     * @return a list of integers within the specified range
     */

    public static List<Integer> range(int start, Integer... args) {
        List<Integer> numList = new ArrayList<>();

        int end = start;
        int step = 1;


        if (args.length > 0) {
            if (args[0] != null) {
                end = args[0];
            }
            if (args.length > 1 && args[1] != null) {
                step = args[1];
            }
        }

        if (args.length == 0) {
            for (int i = 0; i < start; i++) {
                numList.add(i);
            }
        } else {
            if (start < end && step > 0) {
                for (int i = start; i < end; i += step) {
                    numList.add(i);
                }
            } else if (start > end && step < 0) {
                for (int i = start; i > end; i += step) {
                    numList.add(i);
                }
            } else if (start > end && step > 0) {
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

    /**
     * Reads the content of a text file and returns it as a single string.
     *
     * @param filePath the path to the text file to be read
     * @return a string representing the content of the file
     * @throws IOException if an I/O error occurs while reading the file
     */
    public static String readFile(String filePath) throws IOException {
        StringBuilder content = new StringBuilder();
        BufferedReader reader = new BufferedReader(new FileReader(filePath));
        String line;
        while ((line = reader.readLine()) != null) {
            content.append(line).append(System.lineSeparator());
        }
        reader.close();
        return content.toString();
    }

    /**
     * Appends content to a text file.
     *
     * @param filePath the path to the text file
     * @param content  the content to append to the file
     * @throws IOException if an I/O error occurs while writing to the file
     */
    public static void appendToFile(String filePath, String content) throws IOException {
        BufferedWriter writer = new BufferedWriter(new FileWriter(filePath, true));
        writer.append(content);
        writer.close();
    }


    /**
     * Reads the content of a text file line by line and returns it as a list of strings.
     *
     * @param filePath the path to the text file to be read
     * @return a list of strings representing the lines of the file
     * @throws IOException if an I/O error occurs while reading the file
     */
    public static List<String> readLines(String filePath) throws IOException {
        List<String> lines = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new FileReader(filePath));
        String line;
        while ((line = reader.readLine()) != null) {
            lines.add(line);
        }
        reader.close();
        return lines;
    }

    /**
     * Prepends content to a text file.
     *
     * @param filePath the path to the text file
     * @param content  the content to prepend to the file
     * @throws IOException if an I/O error occurs while writing to the file
     */
    public static void prependToFile(String filePath, String content) throws IOException {
        List<String> lines = readLines(filePath);
        BufferedWriter writer = new BufferedWriter(new FileWriter(filePath));
        writer.write(content);
        writer.newLine();
        for (String line : lines) {
            writer.write(line);
            writer.newLine();
        }
        writer.close();
    }


    /**
     * A simple HTTP GET request utility class for making GET requests with headers.
     */
    class GetReq {
        private String urlString;
        private Map<String, String> headers;

        /**
         * Constructs a new GetReq instance with the specified URL.
         *
         * @param urlString the URL to which the GET request will be sent
         */
        public GetReq(String urlString) {
            this.urlString = urlString;
            this.headers = new HashMap<>();
        }


        /**
         * Adds headers to the GET request.
         *
         * @param headers headers to be added to the GET request in key-value pairs
         *                (e.g., "HeaderName1", "HeaderValue1", "HeaderName2", "HeaderValue2", ...)
         * @throws IllegalArgumentException if the headers array length is not even
         */
        public void addHeaders(String... headers) {
            if (headers.length % 2 != 0) {
                throw new IllegalArgumentException("Headers must be provided as key-value pairs");
            }
            for (int i = 0; i < headers.length; i += 2) {
                this.headers.put(headers[i], headers[i + 1]);
            }
        }

        /**
         * Sends the GET request with the specified headers and returns the response.
         *
         * @return an instance of HttpResponse containing the response code and body
         * @throws IOException if an I/O exception occurs while sending the request or reading the response
         */
        public HttpResponse send() throws IOException {
            URL url = new URL(urlString);
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();

            connection.setRequestMethod("GET");

            for (Map.Entry<String, String> entry : headers.entrySet()) {
                connection.setRequestProperty(entry.getKey(), entry.getValue());
            }

            int responseCode = connection.getResponseCode();
            String responseBody = null;
            if (responseCode == HttpURLConnection.HTTP_OK) {
                BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()));
                StringBuilder response = new StringBuilder();
                String inputLine;
                while ((inputLine = in.readLine()) != null) {
                    response.append(inputLine);
                }
                in.close();
                responseBody = response.toString();
            }
            connection.disconnect();
            return new HttpResponse(responseCode, responseBody);
        }

        /**
         * Represents an HTTP response containing the response code and body.
         */
        public static class HttpResponse {
            private int responseCode;
            private String responseBody;


            /**
             * Constructs a new HttpResponse instance with the specified response code and body.
             *
             * @param responseCode the HTTP response code
             * @param responseBody the response body
             */
            public HttpResponse(int responseCode, String responseBody) {
                this.responseCode = responseCode;
                this.responseBody = responseBody;
            }

            /**
             * Gets the HTTP response code.
             *
             * @return the HTTP response code
             */
            public int getResponseCode() {
                return responseCode;
            }


            /**
             * Gets the response body.
             *
             * @return the response body
             */
            public String getResponseBody() {
                return responseBody;
            }
        }

    }



}
