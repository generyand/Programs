package Practice;

import java.util.Scanner;

public class doWhileLoop {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        
        int num = 0;
        do {
            System.out.print("Guess my number (1-10): ");
            num = scan.nextInt();

            if (num < 7) {
                System.out.println("Wrong. Too low\n");
            }

            if (num > 7) {
                System.out.println("Wrong. Too high\n");
            }
        } while (num != 7);
        scan.close();

        System.out.println(num + " is correct. You got it!");

    }
}
