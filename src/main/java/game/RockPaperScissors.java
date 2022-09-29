package game;


import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;


public class RockPaperScissors {
    private static final Random random = new Random();

    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        // boolean choice = false;
        int result = 10;
        int playerWin = 0;
        int gameTie = 0;
        int opponentWin = 0;

        while (true) {
            String input = scan.next();

            if (input.equals("1") || input.toLowerCase().equals("rock")) {
                System.out.println("You chose " + ChoiceInNumber.ROCK);
                result = hasPlayerWon(1);
            } else if (input.equals("2") || input.toLowerCase().equals("paper")) {
                System.out.println("You chose " + ChoiceInNumber.PAPER);
                result = hasPlayerWon(2);
            } else if (input.equals("3") || input.toLowerCase().equals("scissors")) {
                System.out.println("You chose " + ChoiceInNumber.SCISSORS);
                result = hasPlayerWon(3);
            } else if (input.equals("4")) {
                System.out.println("End Game!");
                System.out.println("You won " + playerWin + " times, " + gameTie + " tied games, Opponent won " + opponentWin + " times.");
                System.exit(0);

            }

            switch (result) {
                case 1 -> {
                    System.out.println("You won!");
                    playerWin++;
                }
                case 0 -> {
                    System.out.println("It's a tie!");
                    gameTie++;
                }
                case -1 -> {
                    System.out.println("You lost!");
                    opponentWin++;

                }
            }

        }


//        while (true) {
//            final String line = scan.next();
//            try {
//                switch (line) {
//                    case "1":
//                        System.out.println(ChoiceInNumber.ROCK);
//                    case "2":
//                        System.out.println(ChoiceInNumber.PAPER);
//                    case "3":
//                        System.out.println(ChoiceInNumber.SCISSORS);
//                    case "4":
//                        System.out.println("Bye!");
//                    default: throw new Exception();
//                }
//            } catch (final Exception e) {
//                if (!line.equals("1") || !line.equals("2") || !line.equals("3") || !line.equals("4"))
//                    // e.printStackTrace();
//                    System.err.println("Illegal command syntax: " + line);
//            }
//        }
    }

    private static int getPlayerWins(int playerWin) {
        return playerWin;
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