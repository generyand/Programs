import java.util.Scanner;

public class Exc4 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String months[][] = {
                { "January", "31" },
                { "February", "28" },
                { "March", "31" },
                { "April", "30" },
                { "May", "31" },
                { "June", "30" },
                { "July", "31" },
                { "August", "31" },
                { "September", "30" },
                { "October", "31" },
                { "November", "30" },
                { "December", "31" }
        };

        System.out.print("Input a month number: ");
        int number = scan.nextInt();
        System.out.print("Input a year: ");
        int year = scan.nextInt();
        scan.close();

        boolean leapYear;
        if ((year % 100) == 0) {
            if ((year % 400) == 0) {
                leapYear = true;
            } else {
                leapYear = false;
            }
        } else if ((year % 4) == 0) {
            leapYear = true;
        } else {
            leapYear = false;
        }

        if (leapYear) {
            months[1][1] = "29";
        }

        System.out.println();
        
        System.out.println(months[number - 1][0] + " year " + year + " has " +
        months[number - 1][1] + " days");
        System.out.println();

    }

}