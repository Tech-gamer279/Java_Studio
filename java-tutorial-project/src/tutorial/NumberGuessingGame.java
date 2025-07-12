public class NumberGuessingGame {
    private int secretNumber;
    
    public void startGame() {
        generateSecretNumber();
        System.out.println("Guess a number between 1 and 10:");
        Scanner scanner = new Scanner(System.in);
        int guess;

        while (true) {
            guess = scanner.nextInt();
            if (guess == secretNumber) {
                System.out.println("Congratulations! You guessed the number.");
                break;
            } else if (guess < secretNumber) {
                System.out.println("Too low! Try again:");
            } else {
                System.out.println("Too high! Try again:");
            }
        }
        scanner.close();
    }

    private void generateSecretNumber() {
        Random random = new Random();
        secretNumber = random.nextInt(10) + 1; // Random number between 1 and 10
    }
}