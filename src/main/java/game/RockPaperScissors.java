package game;


import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {
    private static Random random = new Random();

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        boolean choice = false;

        while (true) {
            String input = scan.next();
            int result = 10;

            if (input.equals("1")) {
                System.out.println("You chose " + ChoiceInNumber.ROCK);
                result = hasPlayerWon(1);
            } else if (input.equals("2")) {
                System.out.println("You chose " + ChoiceInNumber.PAPER);
                result = hasPlayerWon(2);
            } else if (input.equals("3")) {
                System.out.println("You chose " + ChoiceInNumber.SCISSORS);
                result = hasPlayerWon(3);
            } else if (input.equals("4")) {
                System.out.println("End Game!");
                System.exit(0);
            }

            switch (result) {
                case 1 -> System.out.println("You won!");
                case 0 -> System.out.println("It's a tie!");
                case -1 -> System.out.println("You lost!");
            }

        }
    }

    public static ChoiceInNumber getOpponentChoice() {
        int randomNr = random.nextInt(1, 4);
        return switch (randomNr) {
            case 1 -> ChoiceInNumber.ROCK;
            case 2 -> ChoiceInNumber.PAPER;
            case 3 -> ChoiceInNumber.SCISSORS;
            default -> null;
        };
    }

    public static int hasPlayerWon(int playerChoice) {
        ChoiceInNumber opponentChoice = getOpponentChoice();
        System.out.println("Opponent chose " + opponentChoice);
        if (playerChoice == opponentChoice.getChoiceNumber()) {
            return 0;
        } else if ((playerChoice == 1 && opponentChoice.getChoiceNumber() == 3) || (playerChoice == 3 && opponentChoice.getChoiceNumber() == 2) || (playerChoice == 2 && opponentChoice.getChoiceNumber() == 1)) {
            return 1;
        } else {
            return -1;
        }
    }
}