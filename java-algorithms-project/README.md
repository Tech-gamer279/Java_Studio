# Java Algorithms Project

## Overview
This project implements a collection of common algorithms in Java, including sorting and searching algorithms. The goal is to provide a clear and efficient implementation of these algorithms, along with utility methods that can be used across different algorithm implementations.

## Algorithms Implemented
- **Sorting Algorithms**
  - Bubble Sort
  - Quick Sort
  - Merge Sort

- **Searching Algorithms**
  - Linear Search
  - Binary Search

## Project Structure
```
java-algorithms-project
├── src
│   ├── algorithms
│   │   ├── SortAlgorithms.java
│   │   ├── SearchAlgorithms.java
│   │   └── Utils.java
│   └── Main.java
├── test
│   ├── algorithms
│   │   ├── SortAlgorithmsTest.java
│   │   ├── SearchAlgorithmsTest.java
│   │   └── UtilsTest.java
├── README.md
```

## How to Run
1. Clone the repository to your local machine.
2. Navigate to the project directory.
3. Compile the Java files using:
   ```
   javac src/Main.java src/algorithms/*.java
   ```
4. Run the main application using:
   ```
   java src.Main
   ```

## Running Tests
To run the unit tests, you will need to have JUnit set up in your project. You can run the tests using your preferred IDE or by using a build tool like Maven or Gradle.

## Examples of Usage
You can refer to the `Main.java` file for examples of how to use the implemented algorithms. The utility methods in `Utils.java` can help you generate random arrays and print them for testing purposes.

## Contributing
Feel free to contribute to this project by adding new algorithms or improving existing implementations. Please ensure that you include tests for any new features you add.