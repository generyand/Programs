import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class PasswordGenerator3 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        StringBuilder builder = new StringBuilder();
        Random rand = new Random();
        String alph = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";

        boolean notNum = false;
        System.out.println("Your password must have at least 5 characters.");
        int passLength = 0;
        do {
            try {
                System.out.print("How many characters do you want in your password? ");
                passLength = scan.nextInt();
                while (passLength < 5) {
                    System.out.println("\nYour password must have at least 5 characters. Please try again");
                    System.out.print("How many characters do you want in your password? ");
                    passLength = scan.nextInt();
                }

                notNum = false;
        
                for (int i = 0; i < passLength; i++) {
                    int randCase = rand.nextInt(2);
                    int randNum = rand.nextInt(alph.length());
                    if (randCase == 0) {
                        alph = alph.toLowerCase();
                    } else {
                        alph = alph.toUpperCase();
                    }
                    builder.append(alph.charAt(randNum));
                }
        
                System.out.println("\nHere's your password: " + builder);
            } catch (InputMismatchException ime) {
                notNum = true;
                scan.nextLine();
                System.out.println("\nError. Please Enter a number.");
            }
        } while (notNum);
        scan.close();


    }

}