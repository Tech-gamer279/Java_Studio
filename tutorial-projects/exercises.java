// Java Exercises:
// Practice basic concepts with these simple exercises.

public class Exercises {
    public static void main(String[] args) {
        // 1. Print "Hello, Java!"
        System.out.println("Hello, Java!");

        // 2. Add two numbers and print the result
        int x = 7;
        int y = 5;
        System.out.println("Sum: " + (x + y));

        // 3. Check if a number is even or odd
        int number = 10;
        if (number % 2 == 0) {
            System.out.println(number + " is even.");
        } else {
            System.out.println(number + " is odd.");
        }

        // 4. Find the largest of three numbers
        int a = 12, b = 25, c = 9;
        int largest = a;
        if (b > largest) largest = b;
        if (c > largest) largest = c;
        System.out.println("Largest: " + largest);

        // 5. Print all elements of an array
        int[] arr = {2, 4, 6, 8};
        for (int value : arr) {
            System.out.println("Array value: " + value);
        }
    }
}