import java.util.Scanner;
import java.util.Random;

public class RockPaperScissors {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Welcome to Rock-Paper-Scissors!");
        System.out.println("Enter your choice: (1) Rock, (2) Paper, (3) Scissors");

        int playerChoice = scanner.nextInt();
        int computerChoice = random.nextInt(3) + 1;

        String playerChoiceString = convertToChoiceString(playerChoice);
        String computerChoiceString = convertToChoiceString(computerChoice);

        System.out.println("Player chooses " + playerChoiceString);
        System.out.println("Computer chooses " + computerChoiceString);

        String result = determineWinner(playerChoice, computerChoice);
        System.out.println(result);
    }

    public static String convertToChoiceString(int choice) {
        switch (choice) {
            case 1:
                return "Rock";
            case 2:
                return "Paper";
            case 3:
                return "Scissors";
            default:
                return "Invalid choice";
        }
    }

    public static String determineWinner(int playerChoice, int computerChoice) {
        if (playerChoice == computerChoice) {
            return "It's a tie!";
        } else if ((playerChoice == 1 && computerChoice == 3) ||
                   (playerChoice == 2 && computerChoice == 1) ||
                   (playerChoice == 3 && computerChoice == 2)) {
            return "Player wins!";
        } else {
            return "Computer wins!";
        }
    }
}
