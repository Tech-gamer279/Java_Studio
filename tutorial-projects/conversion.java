// Conversion of Data Types in Java:
// Java allows you to convert data from one type to another. This is called type casting.

// All executable code must be inside a method and class in Java.
// The following is the correct structure:

public class ConversionExample {
    public static void main(String[] args) {
        // Implicit Conversion (Widening Casting):
        // Automatically converts a smaller type to a larger type size.
        int num = 10;
        double doubleNum = num; // int to double
        System.out.println("Implicit conversion (int to double): " + doubleNum);

        // Explicit Conversion (Narrowing Casting):
        // Manually converts a larger type to a smaller type size.
        double price = 19.99;
        int intPrice = (int) price; // double to int
        System.out.println("Explicit conversion (double to int): " + intPrice);

        // Example with char and int:
        char letter = 'A';
        int ascii = (int) letter; // char to int
        System.out.println("Char to int (ASCII value): " + ascii);
    }
}