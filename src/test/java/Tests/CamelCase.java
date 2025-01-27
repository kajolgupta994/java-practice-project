package Tests;

import java.util.*;

public class CamelCase {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read input until EOF
        List<String> inputs = new ArrayList<>();
        while (scanner.hasNextLine()) {
            inputs.add(scanner.nextLine());
        }
        scanner.close();

        // Process each input line
        for (String input : inputs) {
            String[] parts = input.split(";");
            String operation = parts[0];
            String type = parts[1];
            String data = parts[2];

            if (operation.equals("S")) {
                System.out.println(splitCamelCase(type, data));
            } else if (operation.equals("C")) {
                System.out.println(combineCamelCase(type, data));
            }
        }
    }

    private static String splitCamelCase(String type, String data) {
        // Remove parentheses for methods
        if (type.equals("M")) {
            data = data.substring(0, data.length() - 2); // Remove "()"
        }

        // Use regex to split camel case
        String[] words = data.split("(?=[A-Z])");
        StringBuilder result = new StringBuilder();

        for (String word : words) {
            result.append(word.toLowerCase()).append(" ");
        }

        return result.toString().trim();
    }

    private static String combineCamelCase(String type, String data) {
        String[] words = data.split(" ");
        StringBuilder result = new StringBuilder();

        if (type.equals("C")) {
            // Capitalize the first letter for class names
            for (String word : words) {
                result.append(capitalize(word));
            }
        } else if (type.equals("M")) {
            // Capitalize words except the first one, add parentheses
            result.append(words[0]);
            for (int i = 1; i < words.length; i++) {
                result.append(capitalize(words[i]));
            }
            result.append("()");
        } else if (type.equals("V")) {
            // Capitalize words except the first one
            result.append(words[0]);
            for (int i = 1; i < words.length; i++) {
                result.append(capitalize(words[i]));
            }
        }

        return result.toString();
    }

    private static String capitalize(String word) {
        return word.substring(0, 1).toUpperCase() + word.substring(1);
    }
}
