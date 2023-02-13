package Practice;

import java.io.IOException;
import java.util.Scanner;

public class loader {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String message = scan.nextLine();
        scan.close();

        clearScreen();
        load();
        System.out.println(message + " too :D");

    }

    private static void load() {
        try {
            int time = 50;
            int size = 12;

            for (int i = 1; i <= size; i++) {
                int random_int = (int) Math.floor(Math.random() * (100 - 1 + 1) + 50);
                System.out.printf("\n\n[%-12s]", "#".repeat(i));
                Thread.sleep(random_int);
                clearScreen();
            }

            String[] arrow = {
                    ">           ",
                    "->          ",
                    "-->         ",
                    "--->        ",
                    " --->       ",
                    "  --->      ",
                    "   --->     ",
                    "    --->    ",
                    "     --->   ",
                    "      --->  ",
                    "       ---> ",
                    "        --->",
                    "         ---",
                    "          --",
                    "           -",
                    "            ",
            };

            while (true) {

                for (int i = 0; i < arrow.length; i++) {
                    System.out.printf("\n\n\t\t[%s]", arrow[i]);
                    Thread.sleep(time);
                    clearScreen();
                }

            }

        } catch (InterruptedException ie) {
            ie.printStackTrace();
        }
    }

    private static void clearScreen() {

        try {
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        } catch (IOException | InterruptedException ioe) {
            ioe.printStackTrace();
        }
    }

}
