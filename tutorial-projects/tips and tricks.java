// Java Tips and Tricks:

import java.util.Arrays;

public class TipsAndTricksExample {
    public static void main(String[] args) {
        // 1. Use meaningful variable names for better readability.
        int studentCount = 30;

        // 2. Always initialize variables before using them.
        double total = 0.0;

        // 3. Use comments to explain complex logic.
        int result = calculateSomething(); // This method calculates the final score

        // 4. Prefer for-each loops for iterating over collections.
        int[] numbers = {1, 2, 3, 4, 5};
        for (int num : numbers) {
            System.out.println(num);
        }

        // 5. Use try-catch blocks to handle exceptions and avoid program crashes.
        try {
            int division = 10 / 0;
        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero!");
        }

        // 6. Format output for better presentation.
        System.out.printf("Total: %.2f\n", total);

        // 7. Use built-in libraries to simplify tasks.
        System.out.println(Arrays.toString(numbers));
    }

    // Example method for demonstration
    public static int calculateSomething() {
        return 42;
    }
}