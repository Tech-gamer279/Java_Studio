// Operations in Java:
// Java supports various types of operations, such as arithmetic, relational, logical, and assignment operations.

// Arithmetic Operations:
// These are used to perform mathematical calculations.
// The following lines are examples and should be inside a method, not at the top level.
// Remove or comment out the incorrect top-level code below:
//
// int x = 10;
// int y = 3;
// System.outprintln("Addition: " + (x + y))      // Output: 13
// System.out.println("Subtraction: " + (x - y))   // Output: 7
// System.out.println("Multiplication: " + (x * y))// Output: 30
// System.out.println("Division: " + (x / y))      // Output: 3
// System.out.println("Modulus: " + (x % y))       // Output: 1

public class OperationsExample {
    public static void main(String[] args) {
        // Arithmetic Operations
        int x = 10;
        int y = 3;
        System.out.println("Addition: " + (x + y));      // Output: 13
        System.out.println("Subtraction: " + (x - y));   // Output: 7
        System.out.println("Multiplication: " + (x * y));// Output: 30
        System.out.println("Division: " + (x / y));      // Output: 3
        System.out.println("Modulus: " + (x % y));       // Output: 1

        // Relational Operations
        System.out.println(x > y);   // true
        System.out.println(x < y);   // false
        System.out.println(x == y);  // false
        System.out.println(x != y);  // true

        // Logical Operations
        boolean a = true;
        boolean b = false;
        System.out.println(a && b);  // false
        System.out.println(a || b);  // true
        System.out.println(!a);      // false

        // Assignment Operations
        int z = 5;
        z += 3;     // z = z + 3; Result: 8
        z *= 2;     // z = z * 2; Result: 16
        System.out.println("z = " + z);
    }
}