import java.util.Scanner;

public class Exercise3 {
    /*
    3.	Create a java application that will ask for two numbers and display for Difference, product, and Remainder. If the remainder is 0. Display “Remainder is 0” along with the difference and product, otherwise display “Remainder is not 0”.
    */
    public static void main(String[] args) {
        Scanner scan =  new Scanner(System.in);

        System.out.print("Enter 1st number: ");
        int num1 = scan.nextInt();
        System.out.print("Enter 2nd number: ");
        int num2 = scan.nextInt();
        scan.close();
        System.out.println("---------------------");

        int remainder = num1 % num2;
        int difference = num1 - num2;
        int product = num1 * num2;

        if (remainder == 0) {
            System.out.println("Remainder is 0");
        } else {
            System.out.println("Remainder is NOT 0");
        }

        System.out.println("The Difference is " + difference);
        System.out.println("The Product is " + product);

    }

}
