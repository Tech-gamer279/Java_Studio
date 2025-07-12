// Data Types in Java:
// Java supports various data types to store different kinds of values.

// Primitive Data Types:
// 1. int      - stores integers (e.g., 10, -5)
// 2. double   - stores decimal numbers (e.g., 3.14, -2.5)
// 3. char     - stores a single character (e.g., 'A', 'z')
// 4. boolean  - stores true or false values
// 5. byte     - stores small integers (-128 to 127)
// 6. short    - stores small integers (-32,768 to 32,767)
// 7. long     - stores large integers
// 8. float    - stores decimal numbers (less precision than double)

// Example usage:
public class TypesExample {
    public static void main(String[] args) {
        int age = 25;
        double price = 19.99;
        char grade = 'A';
        boolean isJavaFun = true;
        byte smallNumber = 100;
        short shortNumber = 20000;
        long bigNumber = 123456789L;
        float temperature = 36.6f;

        System.out.println("Age: " + age);
        System.out.println("Price: " + price);
        System.out.println("Grade: " + grade);
        System.out.println("Is Java fun? " + isJavaFun);
        System.out.println("Small Number: " + smallNumber);
        System.out.println("Short Number: " + shortNumber);
        System.out.println("Big Number: " + bigNumber);
        System.out.println("Temperature: " + temperature);
    }
}