package Practice;

import java.util.Random;
import java.util.Scanner;

public class test3 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        Random rand = new Random();

        String picks[] = { "Rock", "Scissor", "Paper" };
        int ran = rand.nextInt(picks.length);

        System.out.print("Legend");
        System.out.println("Rock = 0, \nScissor = 1, \nPaper = 2");
        System.out.println("-".repeat(50));

        System.out.println("Enter a pick: ");
        int pick = scan.nextInt();

        if (ran == 0 && pick == 1 || ran == 1 && pick == 2 || ran == 2 && pick == 0) {
            System.out.println("You pick a" + picks[ran] + "Vs. Computer picks a " + picks[pick]);
            System.out.println("You Win!");
            System.out.println("-".repeat(50));
        } else if (ran == 0 && pick == 2 || ran == 1 && pick == 0 || ran == 2 && pick == 0) {
            System.out.println("You pick a" + picks[ran] + "Vs. Computer picks a " + picks[pick]);
            System.out.println("You Lose!");
        } else {
            System.out.println("You pick a " + picks[ran] + "Vs. Computer picks a " + picks[pick]);
            System.out.println("Draw!");
        }
        System.out.println("------Process Complete");

    }

}
