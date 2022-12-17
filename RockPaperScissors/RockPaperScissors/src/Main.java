import java.util.Random;
import java.util.Scanner;

public class Main {
    static String playerMove;

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        boolean play = true;
        while (play == true) {
            String[] rps = { "r", "p", "s" };
            String computerMove = rps[new Random().nextInt(rps.length)];
            // playerMove = "";

            playerMove = playerTurn(scan, playerMove);
            System.out.println("\nComputer played: " + computerMove);
            winningCondition(computerMove, playerMove);

            String askToPlayAgain;
            do {
                System.out.println("Play again? (yes/no)");
                askToPlayAgain = scan.nextLine();
                if (askToPlayAgain.equals("yes")) {
                    playerTurn(scan, playerMove);
                } else if (askToPlayAgain.equals("no")) {
                    play = false;
                    break;
                } else {
                    System.out.println("\n" + askToPlayAgain + " is not a valid key.");
                }
            } while (!askToPlayAgain.equals("yes") || !askToPlayAgain.equals("no"));
            // return play;

        }

    }


    // private static boolean playAgain(Scanner scan, boolean play) {
    //     String askToPlayAgain;
    //     do {
    //         System.out.println("Play again? (yes/no)");
    //         askToPlayAgain = scan.nextLine();
    //         if (askToPlayAgain.equals("yes")) {
    //             playerTurn(scan, playerMove);
    //         } else if (askToPlayAgain.equals("no")) {
    //             play = false;
    //             break;
    //         } else {
    //             System.out.println("\n" + askToPlayAgain + " is not a valid key.");
    //         }
    //     } while (!askToPlayAgain.equals("yes") || !askToPlayAgain.equals("no"));
    //     return play;
    // }


    private static void winningCondition(String computerMove, String playerMove) {
        if (playerMove.equals(computerMove)) {
            System.out.println("Draw");
        }

        else if (playerMove.equals("r")) {
            if (computerMove.equals("p")) {
                System.out.println("You lose!\n");
            } else if (computerMove.equals("p")) {
                System.out.println("You win!\n");
            }
        }

        else if (playerMove.equals("p")) {
            if (computerMove.equals("r")) {
                System.out.println("You win!\n");
            } else if (computerMove.equals("s")) {
                System.out.println("You lose!\n");
            }
        }

        else if (playerMove.equals("s")) {
            if (computerMove.equals("p")) {
                System.out.println("You win!\n");
            } else if (computerMove.equals("r")) {
                System.out.println("You lose!\n");
            }
        }
    }

    private static String playerTurn(Scanner scan, String playerMove) {
        while (true) {
            System.out.println("Please enter your move (r, p, or s)");
            playerMove = scan.nextLine();
            if (playerMove.equals("r") || playerMove.equals("p") || playerMove.equals("s")) {
                break;
                // System.out.println("You played " + playerMove);
            }
            System.out.println("\n" + playerMove + " is not a valid move.");
        }
        return playerMove;
    }

}
