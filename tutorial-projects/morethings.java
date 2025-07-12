// More Things in Java:

public class MoreThingsExample {
    // Method example
    public static int add(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        // 1. String Operations
        String greeting = "Hello";
        String name = "World";
        System.out.println(greeting + ", " + name + "!"); // Concatenation

        // 2. Arrays
        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println("First number: " + numbers[0]);

        // 3. Loops
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Number at index " + i + ": " + numbers[i]);
        }

        // 4. Method usage
        System.out.println("Sum: " + add(5, 3));
    }
}