import java.util.Scanner;

public class Exc3 {
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Input:");
        System.out.print("\tEnter the amount of change from 1 to 99:\t");
        int input = scan.nextInt();
        int cents = input;
        scan.close();
        System.out.println();

        System.out.println("Output:");
        if (input >= 0 && input < 100) {
            int quarter = cents / 25;
            cents %= 25;
    
            int dime = cents / 10;
            cents %= 10;
    
            int nickel = cents / 5;
            cents %= 5;
    
            int penny = cents;
    
            System.out.printf("\t" + input + " Cents in coins:");
            System.out.printf("\n\t%d %-20s %d", quarter, "quarters", (quarter * 25));
            System.out.printf("\n\t%d %-20s %d", dime, "dime", (dime * 10));
            System.out.printf("\n\t%d %-20s %d", nickel, "nickels", (nickel * 5));
            System.out.printf("\n\t%d %-20s %d", penny, "penny", penny);
        } else {
            System.out.println("\tInvalid. You can only enter 1-99 cents");
        }

        System.out.println("\n");
    }

}