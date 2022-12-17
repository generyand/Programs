import java.util.Scanner;

public class Exc5 {
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Determine whether a year is a leap year or not");
        System.out.print("Input year: ");
        int year = scan.nextInt();
        scan.close();

        System.out.println();

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
            System.out.println(year + " is a leap year");
        } else {
            System.out.println(year + " is not a leap year");
        }

    }

}