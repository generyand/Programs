import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class RPSTest2 {
    
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        Random rand = new Random();
        String[] rps = {"Rock", "Paper", "Scissor"};

        System.out.println("Hello there, my friend! :D");
        System.out.println("This is rock, paper, and scissor.");
        System.out.println("First one to get 5 points wins!");
        System.out.println();

        System.out.print("Do you want to play? Y/N:\t");
        String willPlay = scan.nextLine();

        while (!willPlay.equalsIgnoreCase("y") && !willPlay.equalsIgnoreCase("n")) {
            System.out.print("\nInvalid.\nPlease enter a valid key:\t");
            willPlay = scan.nextLine();
        }
        
        while (willPlay.equalsIgnoreCase("y")) {
            
            int playerPoints = 0, computerPoints = 0;
            boolean gameEnds = false;

            while (!gameEnds) {

                clearScreen();

                System.out.println("POINTS");
                System.out.println("Player:\t\t" + playerPoints);
                System.out.println("Computer:\t" + computerPoints);

                // Player's Turn
                int playerPick = playerTurn(scan);

                // Computer's turn
                int computerPick = rand.nextInt(3) + 1;

                System.out.println();
                System.out.println("Your pick:\t\t" + rps[playerPick-1]);
                System.out.println("Computer's pick:\t" + rps[computerPick-1]);

                if (
                    playerPick == 1 && computerPick == 3 ||
                    playerPick == 2 && computerPick == 1 ||
                    playerPick == 3 && computerPick == 2) {
                        System.out.println("You won this round");
                        playerPoints++;
                } else if (
                    computerPick == 1 && playerPick == 3 ||
                    computerPick == 2 && playerPick == 1 ||
                    computerPick == 3 && playerPick == 2) {
                        System.out.println("Computer won this round");
                        computerPoints++;
                } else {
                    System.out.println("Draw");
                }

                gameEnds = checkIfSomeoneWon(playerPoints, computerPoints, gameEnds, rps, playerPick, computerPick);
                
                // lets the player see the scores before the screen clears
                waitForPlayertoRead();

            }

            scan.nextLine();
            willPlay = askToPlayAgain(scan);

        }

        scan.close();

    }

    private static String askToPlayAgain(Scanner scan) {
        String willPlay;
        System.out.print("\nDo you want to play again? Y/N:\t");
        willPlay = scan.nextLine();

        while (!willPlay.equalsIgnoreCase("y") && !willPlay.equalsIgnoreCase("n")) {
            System.out.println("Invalid.\nPlease enter a valid key:\t");
            willPlay = scan.nextLine();
        }
        return willPlay;
    }

    private static void waitForPlayertoRead() {
        try {
            Thread.sleep(2500);
        } catch (Exception e) {
        }
    }

    // Clear Screen
    private static void clearScreen() {
        try {
            if (System.getProperty("os.name").contains("Windows")) {
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            } else {
                Runtime.getRuntime();
            }
        } catch (IOException | InterruptedException ex) {
        }
    }

    // Player's turn
    private static int playerTurn(Scanner scan) {
        boolean isValid = false;
                int playerPick = 0;
                System.out.println("\n1 - rock\n2 - paper\n3 - scissor");
                do {
                    try {
                        System.out.print("\nPick your choice:\t");
                        playerPick = scan.nextInt();
                        isValid = true;
                    } catch (InputMismatchException ime) {
                        scan.nextLine();
                        isValid = false;
                        System.out.print("Invalid! Please input a number.\n");
                    }
                } while (!isValid);

                while (playerPick > 3 || playerPick < 1) {
                    System.out.print("Invalid.\nPlease enter a valid play: ");
                    playerPick = scan.nextInt();
                }
        return playerPick;
    }

    // Checks if someone has won
    private static boolean checkIfSomeoneWon(int playerPoints, int computerPoints, boolean gameEnds, String[] rps, int playerPick, int computerPick) {
        if (playerPoints == 5 || computerPoints == 5) {

            clearScreen();
            System.out.println("POINTS");
            System.out.println("Player:\t\t" + playerPoints);
            System.out.println("Computer:\t" + computerPoints);
            System.out.println();
            System.out.println("Your pick:\t\t" + rps[playerPick-1]);
            System.out.println("Computer's pick:\t" + rps[computerPick-1]);

            if (playerPoints == 5) {
                System.out.println("\nCongratulations! You won the game! :D");
            }

            if (computerPoints == 5) {
                System.out.println("\nComputer won the game. :(");
            }
            gameEnds = true;
        }
        return gameEnds;
    }

}
