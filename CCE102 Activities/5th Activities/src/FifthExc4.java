import java.util.Scanner;

public class FifthExc4 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("How many hours did you travel? ");
        double hoursTravelled = scan.nextDouble();

        System.out.print("How many time zones did you cross? ");
        int TZCrossed = scan.nextInt();
        
        System.out.println("\nWhen did you depart?");
        System.out.println("0, for departures between 8AM and noon");
        System.out.println("1, for departures between noon and 6PM");
        System.out.println("2, for departures between 6PM and 10PM");
        System.out.println("3, for departures between 10PM and 1AM");
        System.out.println("4, for departures between 1AM and 8AM");
        int departure = scan.nextInt();

        while (departure < 0 || departure > 4) {
            System.out.println();
            System.out.println("Invalid. You can only enter 0-4. Please try again...");
            departure = scan.nextInt();
        }

        System.out.println("\nWhen did you arrive?");
        System.out.println("0, for departures between 8AM and noon");
        System.out.println("1, for departures between noon and 6PM");
        System.out.println("2, for departures between 6PM and 10PM");
        System.out.println("3, for departures between 10PM and 1AM");
        System.out.println("4, for departures between 1AM and 8AM");
        int arrival = scan.nextInt();

        while (arrival < 0 || arrival > 4) {
            System.out.println();
            System.out.println("Invalid. You can only enter 0-4. Please try again...");
            arrival = scan.nextInt();
        }

        scan.close();

        double numDaysToRecover = (hoursTravelled / 2 + (TZCrossed-3) + departure + arrival) / 10;

        System.out.println("\nThe number of days you need to recover is: " + numDaysToRecover + " days\n");

    }
}