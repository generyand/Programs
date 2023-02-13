import java.util.Random;
import java.util.Scanner;

// import javax.swing.JTable.PrintMode;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random random = new Random();

        String r = "rock";
        String p = "paper";
        String s = "scissors";

        String[] plays = { r, p, s };

        boolean quit = false;

        String comPlay;
        String yourPlay = "";

        int index;

        while (!quit) {
            System.out.println("Do your play: (rock/paper/scissors)");
            yourPlay = scan.nextLine();

            index = random.nextInt(3);

            comPlay = plays[index];
            String prompt = "Your play: " + yourPlay + "      Computer's play: " + comPlay;
            if (yourPlay.equals(comPlay)) {
                System.out.println();
                System.out.println("tie");
            } else if (yourPlay.equals(r) && comPlay.equals(p)) {
                System.out.println(prompt);
                System.out.println("Computer wins!");
            } else if (yourPlay.equals(r) && comPlay.equals(s)) {
                System.out.println(prompt);
                System.out.println("You win!");
            } else if (yourPlay.equals(p) && comPlay.equals(r)) {
                System.out.println(prompt);
                System.out.println("You win!");
            } else if (yourPlay.equals(p) && comPlay.equals(s)) {
                System.out.println(prompt);
                System.out.println("Computer wins!");
            } else if (yourPlay.equals(s) && comPlay.equals(r)) {
                System.out.println(prompt);
                System.out.println("Computer wins!");
            } else if (yourPlay.equals(s) && comPlay.equals(p)) {
                System.out.println(prompt);
                System.out.println("You win!");
            } else {
                System.out.println("Invalid play");
            }

            System.out.println("Do you wanna play again? yes/no");
            String playAgain = scan.nextLine();

            while (!playAgain.equals("yes") && !playAgain.equals("no")) {
                System.out.println("Invalid. Please try again...");
                playAgain = scan.nextLine();

            }

            if (playAgain.equals("yes")) {
                quit = false;
            }

            if (playAgain.equals("no")) {
                quit = true;
            }

            System.out.println();
        }

    }

}
