import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class TicTacToe {

    static ArrayList<Integer> playerPositions = new ArrayList<Integer>();
    static ArrayList<Integer> computerPositions = new ArrayList<Integer>();

    public static void main(String[] args) {

        char[][] gameBoard = { { ' ', '|', ' ', '|', ' ' },
                { '-', '+', '-', '+', '-' },
                { ' ', '|', ' ', '|', ' ' },
                { '-', '+', '-', '+', '-' },
                { ' ', '|', ' ', '|', ' ' } };

        printGameBoard(gameBoard);

        boolean stillPlay = true;
        while (stillPlay) {
            Scanner scan = new Scanner(System.in);

            System.out.println("Enter your placements (1-9):");
            int playerPos = scan.nextInt();
            scan.nextLine();
            while (playerPositions.contains(playerPos) || computerPositions.contains(playerPos)) {
                System.out.println("Position taken! Enter a correct position");
                playerPos = scan.nextInt();
                scan.nextLine();
            }

            placePiece(gameBoard, playerPos, "player");

            String result = checkWinner();
            if (result.length() > 0) {
                System.out.println(result);
                // break;
                System.out.println("Do you want to play again? Y/N");
                String playAgain = scan.nextLine();
                while (!playAgain.equalsIgnoreCase("Y") && !playAgain.equalsIgnoreCase("N")) {
                    System.out.println("Invalid. Please try again...");
                    playAgain = scan.nextLine();
                }

                if (playAgain.equalsIgnoreCase("Y")) {
                    stillPlay = true;
                }
                if (playAgain.equalsIgnoreCase("N")) {
                    stillPlay = false;
                    break;
                }
            }

            Random rand = new Random();
            int computerPos = rand.nextInt(9) + 1;
            while (playerPositions.contains(computerPos) || computerPositions.contains(computerPos)) {
                computerPos = rand.nextInt(9) + 1;
            }

            placePiece(gameBoard, computerPos, "computer");

            printGameBoard(gameBoard);

            result = checkWinner();
            if (result.length() > 0) {
                System.out.println(result);
                // break;
                System.out.println("Do you want to play again? Y/N");
                String playAgain = scan.nextLine();
                while (!playAgain.equalsIgnoreCase("Y") && !playAgain.equalsIgnoreCase("N")) {
                    System.out.println("Invalid. Please try again...");
                    playAgain = scan.nextLine();
                }

                if (playAgain.equalsIgnoreCase("Y")) {
                    stillPlay = true;
                }
                if (playAgain.equalsIgnoreCase("N")) {
                    stillPlay = false;
                    break;
                }
            }

        }

    }

    public static void printGameBoard(char[][] gameBoard) {
        for (char[] row : gameBoard) {
            for (char c : row) {
                System.out.print(c);
            }
            System.out.println();
        }
    }

    public static void placePiece(char[][] gameBoard, int pos, String user) {

        char symbol = ' ';

        if (user.equals("player")) {
            symbol = 'X';
            playerPositions.add(pos);
        } else if (user.equals("computer")) {
            computerPositions.add(pos);
            symbol = 'O';
        }

        switch (pos) {
            case 1:
                gameBoard[0][0] = symbol;
                break;
            case 2:
                gameBoard[0][2] = symbol;
                break;
            case 3:
                gameBoard[0][4] = symbol;
                break;
            case 4:
                gameBoard[2][0] = symbol;
                break;
            case 5:
                gameBoard[2][2] = symbol;
                break;
            case 6:
                gameBoard[2][4] = symbol;
                break;
            case 7:
                gameBoard[4][0] = symbol;
                break;
            case 8:
                gameBoard[4][2] = symbol;
                break;
            case 9:
                gameBoard[4][4] = symbol;
                break;
            default:
                break;
        }

    }

    public static String checkWinner() {

        List topRow = Arrays.asList(1, 2, 3);
        List midRow = Arrays.asList(4, 5, 6);
        List botRow = Arrays.asList(7, 8, 9);
        List leftCol = Arrays.asList(1, 4, 7);
        List midCol = Arrays.asList(2, 5, 8);
        List rightCol = Arrays.asList(3, 6, 9);
        List cross1 = Arrays.asList(1, 5, 9);
        List cross2 = Arrays.asList(7, 5, 3);

        List<List> winning = new ArrayList<List>();
        winning.add(topRow);
        winning.add(midRow);
        winning.add(botRow);
        winning.add(leftCol);
        winning.add(midCol);
        winning.add(rightCol);
        winning.add(cross1);
        winning.add(cross2);

        for (List l : winning) {
            if (playerPositions.containsAll(l)) {
                return "You won!";
            } else if (computerPositions.containsAll(l)) {
                return "You lost";
            } else if (playerPositions.size() + computerPositions.size() == 9) {
                return "Draw";
            }
        }

        return "";
    }

}
