# Java Number Guessing Game

This project is a simple number guessing game implemented in Java. The user is prompted to guess a randomly generated number between 1 and 10. The game provides feedback on whether the guess is too low, too high, or correct.

## Project Structure

```
java-tutorial-project
├── src
│   ├── GamesExample.java
│   └── tutorial
│       └── NumberGuessingGame.java
├── README.md
└── pom.xml
```

## Files Description

- **src/GamesExample.java**: This file contains the main class for the number guessing game. It imports the Scanner and Random classes, initializes a random secret number, and handles user input to guess the number, providing feedback on whether the guess is too low, too high, or correct.

- **src/tutorial/NumberGuessingGame.java**: This file contains a class that encapsulates the logic for the number guessing game. It includes methods to start the game, generate a random number, and handle user guesses.

- **pom.xml**: This file is the configuration file for Maven. It specifies the project dependencies, build settings, and other configurations needed to compile and run the Java project.

## How to Run the Game

1. Ensure you have Java and Maven installed on your machine.
2. Clone the repository or download the project files.
3. Navigate to the project directory in your terminal.
4. Use the following command to compile the project:
   ```
   mvn clean install
   ```
5. Run the game using the following command:
   ```
   mvn exec:java -Dexec.mainClass="GamesExample"
   ```

Enjoy playing the number guessing game!