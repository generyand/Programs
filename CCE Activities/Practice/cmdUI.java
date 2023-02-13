package Practice;

import java.io.IOException;
import java.util.Scanner;

public class cmdUI {

    public static void main(String[] args) throws IOException, InterruptedException {

        Scanner scan = new Scanner(System.in);

        // Load();

        // try {
        // if (System.getProperty("os.name").contains("Windows")) {
        // new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        // } else {
        // Runtime.getRuntime();
        // }
        // } catch (IOException | InterruptedException ex) {
        // }

        // System.out.println("hehe :D");

        // Load();

        // {
        // System.out.print("\033[H\033[2J");
        // System.out.flush();
        // }

        // System.out.println("hihi :D");

        Load();

        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();

        System.out.println("hikhok :D");

    }

    private static void Load() throws InterruptedException {
        Thread.sleep(500);
        System.out.print(".");
        Thread.sleep(500);
        System.out.print(".");
        Thread.sleep(500);
        System.out.print(".");
        Thread.sleep(500);
    }

}
