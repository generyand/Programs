import java.util.Scanner;

public class Exercise5 {
    /*
    5.	Write a java program that calculates the value of the base number raised to the exponent number.
    Sample Output:
	Please enter the base value:    4
	Please enter the exponent value: 3

	The value of 4 raised to the exponent 3 is 64.

    */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Please enter the base value: ");
        int base = scan.nextInt();
        System.out.print("Please enter the exponent value: ");
        int exponent = scan.nextInt();
        scan.close();
        System.out.println();

        double result = Math.pow(base, exponent);

        System.out.printf("The value of " + base + " raised to the exponent " + exponent + " is %.0f\n", result);

    }

}
