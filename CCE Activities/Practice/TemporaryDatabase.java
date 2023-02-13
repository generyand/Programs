package Practice;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class TemporaryDatabase {
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        System.out.println("Hello, there. Do you want to add a name in the list?");
        String response = scan.nextLine();

        if (response.equalsIgnoreCase("yes")) {
            clearScreen();
            System.out.println("Okay. What's your name?");
            String name = scan.nextLine();
            try {
                BufferedReader reader = new BufferedReader(new FileReader("data.txt"));
                BufferedWriter writer = new BufferedWriter(new FileWriter("data.txt"));
                String line;
                while ((line = reader.readLine()) != null) {
                    
                }
                reader.read();
                writer.write(name);
                writer.close();
            } catch (IOException ioe) {
                ioe.printStackTrace();
            }
            System.out.println("Hey, " + name + ". Your name is added on the list. Thank you for adding. :D");
        }
        scan.close();

    }

    public static void clearScreen() {

        try {
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
        
    }

}
