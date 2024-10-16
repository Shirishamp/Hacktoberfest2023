import java.util.Scanner;

public class TypingTest {
    public static void main(String[] args) {
        String sentence = "The quick brown fox jumps over the lazy dog.";
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Typing Test: Type the following sentence:");
        System.out.println(sentence);
        System.out.println("Press Enter when you are ready to start...");

        // Wait for the user to press Enter
        scanner.nextLine();

        long startTime = System.currentTimeMillis(); // Start the timer

        // Get the user's input
        System.out.println("Start typing:");
        String userInput = scanner.nextLine();

        long endTime = System.currentTimeMillis(); // End the timer
        long timeTaken = endTime - startTime; // Calculate time taken in milliseconds

        // Check if the input is correct
        if (userInput.equals(sentence)) {
            System.out.println("Well done! You typed it correctly.");
        } else {
            System.out.println("Oops! Your input was incorrect.");
        }

        // Display the time taken
        System.out.printf("Time taken: %.2f seconds%n", timeTaken / 1000.0);

        scanner.close();
    }
}
