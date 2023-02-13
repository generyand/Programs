import java.util.Scanner;

public class Act5Exc4 {
    public static void main(String[] args) {
        // GENERAL INITIALIZATION
        Scanner scan = new Scanner(System.in);
        int timezone = 0;
        double hours = 0;
        int depart = 0;
        int arrive = 0;

        // ASKING FOR INPUTS
        System.out.print("Hours travelled ");
        hours=scan.nextDouble();
        System.out.print("timezones crossed ");
        timezone=scan.nextInt();
        
        System.out.println();
        System.out.println("Departure time");
        System.out.println("0, for departures between 8AM and noon");
        System.out.println("1, for departures between noon and 6PM");
        System.out.println("3, for departures between 6PM and 10PM");
        System.out.println("4, for departures between 10PM and 1AM");
        System.out.println("5, for departures between 1AM and 8AM");
        depart=scan.nextInt();

        System.out.println();
        System.out.println("Arrival Time");
        System.out.println("0, for departures between 8AM and noon");
        System.out.println("1, for departures between noon and 6PM");
        System.out.println("3, for departures between 6PM and 10PM");
        System.out.println("4, for departures between 10PM and 1AM");
        System.out.println("5, for departures between 1AM and 8AM");
        arrive=scan.nextInt();
        scan.close();

        // PROCESS
        double NumRecover=(hours/2 + (timezone-3) + depart + arrive)/10; // Base rani siya sa formula nga provided sa module

        System.out.println("\nThe number of days you need to recover is: " + NumRecover + " days\n"); // Display or output sa number of recovery days

    }
}